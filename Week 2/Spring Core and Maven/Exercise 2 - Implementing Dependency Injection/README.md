# Exercise 2: Implementing Dependency Injection

## Problem Statement

Implement Dependency Injection (DI) in a Spring application by injecting the BookRepository object into the BookService class using XML configuration.

## Expected Output

`	ext
BookService is working.
BookRepository is working.
`

## Observation

- Spring's IoC container creates and manages application objects (beans).
- Dependency Injection is achieved through setter injection using the <property> tag in pplicationContext.xml.
- The BookRepository bean is automatically injected into the BookService bean.
- This approach reduces tight coupling and makes the application easier to maintain and test.
