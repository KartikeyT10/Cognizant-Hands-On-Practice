# Hello World RESTful Web Service

## Problem Statement

Create a REST service in the Spring Learn application that returns Hello World!! when a GET request is sent to the /hello endpoint.

## API Details

| Method | URL | Response |
|--------|-----|----------|
| GET | /hello | Hello World!! |

## Testing the API

Run the Spring Boot application and open the following URL in a browser or Postman:

`	ext
http://localhost:8083/hello
`

## Expected Response

`	ext
Hello World!!
`

## Expected Logs

`	ext
START - sayHello
END - sayHello
`

## Observation

- @RestController is used to create a REST controller.
- @GetMapping maps GET requests to the /hello endpoint.
- The sayHello() method returns a simple text response.
- Start and end logs are added to track the execution of the method.
- The REST API can be tested using a browser or Postman.
