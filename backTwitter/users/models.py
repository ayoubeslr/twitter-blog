from django.db import models


class Users(models.Model):
    nom = models.CharField(max_length=255)
    prenom = models.CharField(max_length=100, null=True)


class Post(models.Model):
    post = models.CharField(max_length=255)
    date = models.DateField(auto_now=True, auto_now_add=False)
    nb_like = models.CharField(max_length=255, null=True)


class Group(models.Model):
    nom = models.CharField(max_length=255)
