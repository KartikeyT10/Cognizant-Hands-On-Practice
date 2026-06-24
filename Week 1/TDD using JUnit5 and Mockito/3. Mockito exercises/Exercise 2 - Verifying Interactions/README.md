# Exercise 2: Verifying Interactions

## Problem Statement

Use Mockito to verify that a method is called with the expected interaction during test execution.

## Expected Result

`	ext
Test Passed Successfully
`

## Observation

- Mockito's erify() method is used to check whether a method was called.
- The test confirms that getData() is invoked when etchData() is executed.
- Verifying interactions helps ensure that objects communicate as expected.
- This technique is useful when testing services that depend on external components.
