# Exercise 1: Configuring a Basic Spring Application

## Problem Statement

Configure a basic Spring application using XML-based configuration and demonstrate dependency injection between the service and repository layers.

## Maven Dependencies

Add the following dependency to the pom.xml file:

`xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.30</version>
</dependency>
`

## Expected Output

`	ext
BookService is working.
BookRepository is working.
`

## Observation

- Spring manages object creation using the IoC (Inversion of Control) container.
- Beans are configured in the pplicationContext.xml file.
- Dependency Injection is used to inject the BookRepository object into the BookService class.
- The application successfully loads the Spring context and executes the service.
