# SpringBootPracticeProject
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".  We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.

## Bill of materials
A certain combination of jars and their versions that work well which is been approved by spring boot
The Parent version instructs Spring or Maven about the required versions

## Embedded Tomcat server
1. Convenience
2. Servlet Container Config is now application config
3. Standalone application
4. Useful for microservice architecture

## Spring MVC Controller
A Spring MVC application builds these controllers so that we know that when a request comes in we have proper response.These controllers are simple java classes which map a URI and an HTTP method to some functionality.
These methods are annotated with two pieces of information one, is the URI that controller is going to handle when there is a request comming in and the HTTP method that the controller method is gonna handle.
Spring MVC detects rest controller and knew that the response probably need to be JSON, MVC does the conversion of Java Objects into JSON.It does a class path scan and then its gonna return the response based on the request.

## Rest API
Resources(Entities) : Student, Course, Lesson
A student can have multiple Courses and a Course can have multiple lessons

### Student
1. **GET** /students --> Gets all student details. 
2. **GET** /students/id --> Gets details of an individual student.
3. **POST** /students --> Create a new record of student.
4. **PUT** /studetnts/id --> Updates the student record.
5. **DELETE** /topics/id --> Deletes the student record.

## Business Service
In Spring business services are typically Singleton. When the application starts up spring creates an instance of this service and then it keeps that in its memory(registers that instance)

**How to declare that the particular class is business service?**

By using **@Service** annotation, which is a stereotype annotation marks a class as a spring service.

### Starting a Boot App
1. Spring Initalizr
2. Spring Boot CLI(Command Line Interface)
3. STS IDE

### Spring dependencies
1. Spring Web - Full-stack web development with tomcat and Spring MVC

### Customizing Spring Boot

application.properities - a way to customize our spring application 

### Spring Data JPA : The Data Tier
JPA - Java Persistence API, its basically a specification that lets you do ORM(Object-Relational Mapping) when we are connecting to a relational database.An SQL database is typically a relational database we have tables with rows and columns. When we need to connect from your java application to a relational database we use JDBC and run SQL queries which run on relational database and then we get the results and convert it into object instances.

Java classes  --> classes and objects

ORM maps entity classes into SQL tables so when we connect to the database you provide some kind of metadata on our entity classes.
There is no need of doing the query and mapping by ourself, the framework handles it for us.

JPA is a way to use ORM which lets you configure our entity classes and give it to a framework, so that the framework handles conversion from SQL read queries to object instances.

Spring Data JPA ia a seperate project which lets you make working with ORM tool even easier.













