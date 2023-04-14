# NotSteam - Backend

![GitHub top language](https://img.shields.io/github/languages/top/creppyfm/video-game-review-BE?style=plastic)
![GitHub last commit](https://img.shields.io/github/last-commit/creppyfm/video-game-review-BE)

## Backend server for NotSteam.games- a video game review web app that allows users to review popular video games.

<img src="README_Images/home_skyrim.png" alt="Skyrim home page" width="auto">

NotSteam.games is a video game review web app built to allow users to share their opinions on popular video games. 
This RESTful API is built with Java and Spring Boot, and uses Axios HTTP to communicate with the frontend. 

## Authentication

Visitors to the site can log in using Google OAuth one-click login.

<img src="README_Images/googlel_oauth_present_on_FE.png" alt="Google OAuth Example" width="500">

## Cloud Services

The API also leverages the following cloud technologies:

* All images are served from an AWS S3 bucket acting as a CDN.
* The API is deployed to an AWS EC2 t2.micro instance, allowing for dynamic scaling of resources.
* Reviews are stored and retrieved from a MongoDB cluster hosted on MongoDB Atlas

<img src="README_Images/mongodb_skyrim_meta.png" alt="MongoDB Game MetaData" width="500">

## Check it out!

https://notsteam.games/
