from django.urls import path
from . import views

urlpatterns = [
    path('', views.home, name='home'),
    path('contact/', views.contact, name='contact'),
    path('register/', views.register, name='register'),
    path('login/', views.user_login, name='login'),
    path('logout/', views.user_logout, name='logout'),
    path('dashboard/', views.user_dashboard, name='user_dashboard'),
    path('submit-request/', views.submit_request, name='submit_request'),
    path('admin-dashboard/', views.admin_dashboard, name='admin_dashboard'),
    path('update-request/<int:request_id>/', views.update_request, name='update_request'),
]