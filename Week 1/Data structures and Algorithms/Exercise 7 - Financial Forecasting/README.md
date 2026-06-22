# Exercise 7: Financial Forecasting

## Problem Statement

Develop a financial forecasting tool that predicts future values based on historical growth rates using a recursive approach.

## Output

`	ext
Future Value after 5 years: 16105.10
`

## Analysis

### Recursion

Recursion is a technique where a method calls itself repeatedly until a base condition is reached. It can simplify problems that can be divided into smaller subproblems.

### Time Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

where 
 is the number of years.

### Optimization

The recursive solution creates a new function call for every year, which increases memory usage. For large values of 
, an iterative approach can reduce space complexity to O(1).

## Observation

The future value is calculated by applying the growth rate recursively for each year. This demonstrates how recursion can be used to solve forecasting problems involving repeated calculations over time.
 
