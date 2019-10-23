from django.urls import path, include
from . import views
from rest_framework import routers

router = routers.SimpleRouter()
router.register('user', views.UsersViewSet)
router.register('post', views.PostViewSet)
router.register('group', views.GroupViewSet)


urlpatterns = router.urls
