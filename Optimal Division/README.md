[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# 553. Optimal Division
Tags: __Medium__, __Math__, __String__, __Amazon__

Given a list of __positive integers__, the adjacent integers will perform the float division. For example, `[2,3,4] -> 2 / 3 / 4`.

However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. __Your expression should NOT contain redundant parenthesis__.

__Example:__
```
Input: [1000,100,10,2]
Output: "1000/(100/10/2)"
Explanation:
1000/(100/10/2) = 1000/((100/10)/2) = 200
However, the bold parenthesis in "1000/((100/10)/2)" are redundant,
since they don't influence the operation priority. So you should return "1000/(100/10/2)".

Other cases:
1000/(100/10)/2 = 50
1000/(100/(10/2)) = 50
1000/100/10/2 = 0.5
1000/100/(10/2) = 2
```
__Note:__
1. The length of the input array is `[1, 10]`.
2. Elements in the given array will be in range `[2, 1000]`.
3. There is only one optimal division for each test case.

## Source
[comment]: <> (brief intro to the source of this question. e.g.,)
* from [leetcode 553](https://www.google.com)

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
