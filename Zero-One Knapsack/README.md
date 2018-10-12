[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# Zero-One Knapsack
Tags: ___NP-Hard___, ___DP___

Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays `value[0..n-1]` and `weight[0..n-1]` which represent values and weights associated with __n__ items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of __value[]__ such that sum of the weights of this subset is smaller than or equal to __W__. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

## Source
* [Definition and Analysis from Wikipedia](https://en.wikipedia.org/wiki/Knapsack_problem)
* from [geeks for geeks](http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/)

## Complexity/Analysis
The Dynamic Programming solutions will have __O(NW)__ time complexity. The naive space complexity for DP memoization is __O(NW)__, but it can can be optimized to a one-dimensional array, which will have __O(W)__ space. At first glance, it seems to be a polynomial solution, but the __W__ value is not linear to the number of values, can be vary with different weight of the values. There is not a polynomial relation between the number of values and W.

## Notes
* __O(NW)__ is not a polynomial time, it's a NP-complete problem.
