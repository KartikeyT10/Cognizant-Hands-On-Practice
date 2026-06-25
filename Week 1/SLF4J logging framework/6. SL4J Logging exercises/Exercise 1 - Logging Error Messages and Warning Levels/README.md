# Exercise 1: Logging Error Messages and Warning Levels

## Problem Statement

Create a Java application that uses SLF4J and Logback to log warning and error messages.

## Maven Dependencies

Add the following dependencies to the pom.xml file:

`xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.30</version>
</dependency>

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
</dependency>
`

## Expected Output

`	ext
WARN  - This is a warning message
ERROR - This is an error message
`

## Observation

- SLF4J provides a common logging API for Java applications.
- Logback acts as the logging implementation for SLF4J.
- The warn() method is used to log warning messages.
- The error() method is used to log error messages.
- Logging helps monitor application behavior and simplifies debugging.
