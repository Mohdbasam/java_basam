from django.db import models
from django.contrib.auth.models import User


class ServiceRequest(models.Model):
    STATUS_CHOICES = [
        ('Pending', 'Pending'),
        ('Assigned', 'Assigned'),
        ('In Progress', 'In Progress'),
        ('Completed', 'Completed'),
        ('Rejected', 'Rejected'),
    ]

    user = models.ForeignKey(User, on_delete=models.CASCADE, related_name='service_requests')
    vehicle_type = models.CharField(max_length=50)
    vehicle_model = models.CharField(max_length=100)
    issue_desc = models.TextField()
    location = models.CharField(max_length=255, default='Location not provided')
    latitude = models.DecimalField(max_digits=9, decimal_places=6, null=True, blank=True)
    longitude = models.DecimalField(max_digits=9, decimal_places=6, null=True, blank=True)
    request_time = models.DateTimeField(auto_now_add=True)
    status = models.CharField(max_length=20, choices=STATUS_CHOICES, default='Pending')

    def __str__(self):
        return f"Request #{self.id} - {self.user.username}"


class RequestUpdate(models.Model):
    request = models.ForeignKey(ServiceRequest, on_delete=models.CASCADE)
    status = models.CharField(max_length=20)
    remarks = models.TextField(blank=True, null=True)
    updated_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"Update for Request #{self.request.id}"


class ServiceLog(models.Model):
    request = models.OneToOneField(ServiceRequest, on_delete=models.CASCADE)
    service_start = models.DateTimeField(null=True, blank=True)
    service_end = models.DateTimeField(null=True, blank=True)
    total_time = models.IntegerField(null=True, blank=True)
    remarks = models.TextField(blank=True, null=True)

    def __str__(self):
        return f"Service Log for Request #{self.request.id}"
