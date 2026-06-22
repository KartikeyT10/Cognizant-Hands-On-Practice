# Exercise 2: E-commerce Platform Search Function

## Problem Statement

Implement linear search and binary search for an e-commerce platform to search products efficiently. Compare both approaches based on their time complexity.

## Output

`	ext
Linear Search Found: Shoes
Binary Search Found: Shoes
`

## Analysis

### Linear Search
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### Binary Search
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Observation

Linear search checks elements one by one and works on both sorted and unsorted data. Binary search is faster for large datasets but requires the data to be sorted beforehand. For an e-commerce platform with a large number of products, binary search is generally more efficient.
