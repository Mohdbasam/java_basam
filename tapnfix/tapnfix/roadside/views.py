from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.decorators import login_required
from django.contrib.auth.models import User
from django.contrib import messages
from .models import ServiceRequest, RequestUpdate, ServiceLog


# HOME PAGE
def home(request):
    return render(request, 'home.html')


# CONTACT PAGE
def contact(request):
    return render(request, 'contact.html')


# REGISTRATION
def register(request):
    if request.method == 'POST':
        fullname = request.POST.get('fullname')
        email = request.POST.get('email')
        phone = request.POST.get('phone')
        password = request.POST.get('password')
        confirm_password = request.POST.get('confirm_password')

        # Validation
        if password != confirm_password:
            messages.error(request, 'Passwords do not match!')
            return render(request, 'registration.html')

        if User.objects.filter(email=email).exists():
            messages.error(request, 'Email already registered!')
            return render(request, 'registration.html')

        # Create user
        user = User.objects.create_user(
            username=email,
            email=email,
            password=password,
            first_name=fullname
        )

        messages.success(request, 'Registration successful! Please login.')
        return redirect('login')

    return render(request, 'registration.html')


# LOGIN
def user_login(request):
    if request.method == 'POST':
        email = request.POST.get('email')
        password = request.POST.get('password')

        user = authenticate(request, username=email, password=password)

        if user is not None:
            login(request, user)

            # Check if admin
            if user.is_staff or user.is_superuser:
                return redirect('admin_dashboard')
            else:
                return redirect('user_dashboard')
        else:
            messages.error(request, 'Invalid email or password!')

    return render(request, 'login.html')


# LOGOUT
def user_logout(request):
    logout(request)
    messages.success(request, 'Logged out successfully!')
    return redirect('home')


# USER DASHBOARD
@login_required
def user_dashboard(request):
    active_requests = ServiceRequest.objects.filter(
        user=request.user
    ).exclude(status='Completed').order_by('-request_time')

    history_requests = ServiceRequest.objects.filter(
        user=request.user,
        status='Completed'
    ).order_by('-request_time')

    context = {
        'user': request.user,
        'active_requests': active_requests,
        'history_requests': history_requests,
    }
    return render(request, 'user_db.html', context)


# SUBMIT REQUEST
@login_required
def submit_request(request):
    if request.method == 'POST':
        vehicle_type = request.POST.get('vehicle_type')
        vehicle_model = request.POST.get('vehicle_model')
        issue_desc = request.POST.get('issue_desc')
        latitude = request.POST.get('latitude')
        longitude = request.POST.get('longitude')

        # Create location string
        if latitude and longitude:
            location = f"Lat: {latitude}, Long: {longitude}"
        else:
            location = "Location not provided"

        # Create service request
        ServiceRequest.objects.create(
            user=request.user,
            vehicle_type=vehicle_type,
            vehicle_model=vehicle_model,
            issue_desc=issue_desc,
            location=location,
            latitude=latitude if latitude else None,
            longitude=longitude if longitude else None
        )

        messages.success(request, 'Request submitted successfully!')
        return redirect('user_dashboard')

    return redirect('user_dashboard')


# ADMIN DASHBOARD
@login_required
def admin_dashboard(request):
    if not (request.user.is_staff or request.user.is_superuser):
        messages.error(request, 'Access denied!')
        return redirect('user_dashboard')

    total_requests = ServiceRequest.objects.count()
    pending_requests = ServiceRequest.objects.filter(status='Pending').count()
    active_requests = ServiceRequest.objects.filter(status__in=['Assigned', 'In Progress']).count()
    completed_requests = ServiceRequest.objects.filter(status='Completed').count()
    total_users = User.objects.filter(is_staff=False).count()

    recent_requests = ServiceRequest.objects.all().order_by('-request_time')[:10]
    users = User.objects.filter(is_staff=False).order_by('-date_joined')[:10]
    requests = ServiceRequest.objects.all().order_by('-request_time')

    context = {
        'total_requests': total_requests,
        'pending_requests': pending_requests,
        'active_requests': active_requests,
        'completed_requests': completed_requests,
        'total_users': total_users,
        'recent_requests': recent_requests,
        'users': users,
        'requests': requests,
    }
    return render(request, 'admin_db.html', context)


# UPDATE REQUEST STATUS
@login_required
def update_request(request, request_id):
    if not (request.user.is_staff or request.user.is_superuser):
        messages.error(request, 'Access denied!')
        return redirect('user_dashboard')

    if request.method == 'POST':
        new_status = request.POST.get('status')
        service_request = ServiceRequest.objects.get(id=request_id)
        service_request.status = new_status
        service_request.save()

        # Create update log
        RequestUpdate.objects.create(
            request=service_request,
            status=new_status,
            remarks=f"Status changed to {new_status}"
        )

        messages.success(request, f'Request #{request_id} updated to {new_status}')

    return redirect('admin_dashboard')