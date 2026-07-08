# REST - Country Web Service

## Problem Statement

Create a REST service that returns the details of India from the Spring XML configuration.

## API Details

| Method | URL | Description |
|--------|-----|-------------|
| GET | /country | Returns India country details |

## Testing the API

Run the Spring Boot application and open:

`	ext
http://localhost:8083/country
`

## Expected Response

`json
{
    "code": "IN",
    "name": "India"
}
`

## Observation

- The /country endpoint is mapped to the getCountryIndia() method.
- The country bean is loaded from the country.xml configuration file.
- Spring retrieves the bean using getBean().
- The Country object is returned directly from the controller.
- Spring automatically converts the Java object into a JSON response.
