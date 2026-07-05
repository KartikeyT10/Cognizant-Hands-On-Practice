# Hands-on 4: Spring Core - Load Country from Spring Configuration XML

## Problem Statement

Store country details in a Spring XML configuration file and load the country bean using the Spring application context.

## Expected Output

`	ext
Inside Country Constructor
Inside setCode
Inside setName
Country : Country [code=IN, name=India]
`

## Observation

- Country details are configured in the country.xml file.
- The <bean> tag defines the Country object managed by Spring.
- The <property> tags set the code and 
ame values.
- ClassPathXmlApplicationContext loads the XML configuration file.
- getBean() retrieves the country bean from the Spring container.
