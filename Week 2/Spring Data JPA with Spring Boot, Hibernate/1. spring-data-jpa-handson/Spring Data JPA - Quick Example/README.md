# Hands-on 1: Spring Data JPA - Quick Example

## Problem Statement

Create a Spring Boot application using Spring Data JPA and MySQL to retrieve country details from a database.

## Maven Dependencies

The project uses the following dependencies:

- Spring Boot Starter
- Spring Data JPA
- MySQL Driver
- Spring Boot DevTools

## Expected Output

`	ext
Country{code='IN', name='India'}
Country{code='US', name='United States of America'}
`

## Observation

- Spring Data JPA simplifies database access by providing built-in CRUD operations.
- The @Entity annotation maps the Java class to a database table.
- JpaRepository eliminates the need to write basic SQL queries.
- The service layer communicates with the repository to retrieve data from the database.
- The application successfully fetches and displays all country records from MySQL.
