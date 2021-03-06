# Website Project

## Project Description

Our project was about a web app which connects to a maria Database hosted on the Amazon Web Service cloud (AWS). 
The database contained a Users Table with the following schema:
ID: (Autoincrement)
Name: varchar(20),
Password: varchar(20),
Email: varchar(20).

## Technologies Used

* AWS Mariah DB 
* Back End Servelt 
* Front End HTML 3 
* Postman for testing
* HTTP
* ORM
* Servlets
* DevOps (bonus: automate it fully)
* an API which exposes functionality to accept, deserialize, and persist objects in a database. Your API will be remotely accessible and accessed by Postman. A front-end GUI is not required for MVP. You will expose an API which will accept incoming GET, PUT, POST, and DELETE requests. We will use Postman to test and consume your API. Your API will depend on a custom ORM which will be written in it's own project, packaged as a .JAR file, and used as a dependency.


## Features

* login
* Registration
* Get all registered Users Information
* Get one user info
* Delete a user
* Update a user
* All CRUD: Create, Read, Update and Delete
* JDPC and Persistence
* HTML Front End
* Backend Servelt 

## Project met Requirements

Part 1 - Custom ORM:
we developed a custom ORM which uses reflection to dynamically build CRUD functionality without being aware of the structure/schema beforehand. This abstracted all JDBC and persistence logic away from the other part of the project. Your ORM is a dependency to be utilized by the other part of the project.

Part 2 - Web Service:
we have created our own web service used to store, manipulate, and retrieved objects in response to HTTP requests. 

Minimum Requirements met:
* Proper use of OOP principles
* CRUD operations are supported for at least 2 types of objects.
* Communication is done with HTTP exchanges, and resources are transmitted as JSON in request/response bodies.
* JDBC and persi* stence logic should all be part of your ORM which abstracts this away from the rest of the application.
* Documentation (all classes and methods have adequate Javadoc comments)
* All Exceptions are caught and logged to a file
 
 Bonus Features
* Basic HTML/CSS/JS front end to consume API
* ORM can build foreign key relations according to object references.
* ORM can design schema on the fly.
* Automated DevOps CI/CD pipeline to build and deploy project
* Adequate unit test line coverage for service-layer methods(Test as much as possible, ask trainer if unsure)
* Object Store

These are user stories to describe the web service. This is a remotely accessible storage service for persisting and retrieving objects/resources over the internet.

Minimum Viable Product
* As a user, I store JSON objects by invoking the proper endpoint (POST/Create).
* As a user, I can change objects by invoking the proper endpoint (PUT/Update).
* As a user, I can retrieve objects by invoking the proper endpoint (GET/Read).
* As a user, I can delete objects by invoking the proper endpoint (DELETE/Delete).
* As a user, I can retrieve all objects that belong to me. (transmit the user as part of the request header, and build a relation in the db in some way to tie the objects to the user)


Tech Stack
The following technologies were implemented in our project.

* Java 
* HTTP
* Servlets
* Apache Maven for dependencies and project management
* Git & Github for version control
* MariaDB deployed on AWS RDS for data persistence
* Custom ORM for data persistence

Deadline & Presentation
* Finalized version of your project was pushed to our team's p1 repository within the training originzation.
* we gave a brief (10 minute) presentation of our project. 

To do:
* host and deploy the website on AWS. 


## more about the project
I built the ORM and persistence and the Web Servlet which uses the ORM to persist the data to the database. 
I used postman to test my ORM using Post, get, put, delete requests which implemented the CRUD operations. 
I showed a demo of the project and postman to my teammates during our working on the project and helped them in understanding the different parts of the project, especially the postman. 
I also included File Logging of exceptions and error handlings. 

in the meantime, Brian was trusted in building another ORM which used Reflection and Annotations to persists any object. 
His ORM also carried out CRUD operations (Create, Read, Update, and Delete) and He tested his ORM and then I have integrated it to my Web Servlet because it uses Reflection. 
for that we had to work on the interface (methods) of his ORM jar file and got it to be used/invoked successfully from my servlets. 
He also helped implementing and connecting an html page to the ORM and database. Something I had set up as one goal of our project (bonus feature). 

Danial, helped in the overall discussion with his comments and valuable insight during the project time, and he successfully tested a project of his own to keep with the overall work of the project. He also was able to use postman to query database.  



## Getting Started
   
* navigate to the directy where the project needs to be cloned
* open Git Batch
* use the command: git clone "https://github.com/220110-Java-React-Enterprise/Team-A-New.git"


## Contributors

Team Members: 
  * Ahmad Rawashdeh
  * Brian Gardner 
  * Danial Gordon
  

