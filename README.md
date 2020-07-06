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
A Spring MVC application builds these controllers so that we know that when a request comes in we have proper response.These controllers are simple java classes which map a URI and an HTTP method to some functionality.These methods are annotated with two pieces of information one is the URI that controller is going to handle when there is a request comming in and the HTTP method that the controller method is gonna handle.
Spring MVC detects rest controller and knew that the response probably need to be JSON, MVC does the conversion of Java Objects into JSON.It does a class path scan and then its gonna return the response based on the request