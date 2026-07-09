# Create Authentication Service that Returns JWT

## Problem Statement

Create an authentication service that reads user credentials from the Authorization header and returns a JWT token.

## Maven Dependencies

Add the following dependencies to pom.xml:

`xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
`

## API Details

| Method | URL | Description |
|--------|-----|-------------|
| GET | /authenticate | Generates and returns a JWT token |

## Testing the API

Run the application and execute:

`ash
curl -s -u user:pwd http://localhost:8090/authenticate
`

The -u option sends the username and password using HTTP Basic Authentication.

## Sample Response

`json
{
    "token": "eyJhbGciOiJIUzI1NiJ9..."
}
`

## Observation

- User credentials are received through the Authorization header.
- The Base64 encoded credentials are decoded to retrieve the username.
- A JWT token is generated for the authenticated user.
- The generated token is returned as a JSON response.
- JWT can be used for stateless authentication in REST APIs.
