# REST - Get Country Based on Country Code

## Problem Statement

Create a REST service that returns country details based on the country code. The country code matching should be case-insensitive.

## API Details

| Method | URL | Description |
|--------|-----|-------------|
| GET | /countries/{code} | Returns country details based on the country code |

## Sample Request

`	ext
http://localhost:8083/countries/in
`

## Sample Response

`json
{
    "code": "IN",
    "name": "India"
}
`

The country code is case-insensitive, so both IN and in return the same country.

## Observation

- @PathVariable reads the country code from the request URL.
- The controller passes the country code to the service layer.
- The country list is loaded from country.xml.
- equalsIgnoreCase() is used for case-insensitive country code matching.
- The matching Country object is returned and automatically converted to JSON.
