[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# 174. Dungeon Game
Tags: __Hard__, __Binary Search__, __DP__, __Microsoft__

The demons had captured the princess (**P**) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of `M x N` rooms laid out in a 2D grid. Our valiant knight (**K**) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (_negative_ integers) upon entering these rooms; other rooms are either empty (_0_'s) or contain magic orbs that increase the knight's health (_positive_ integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.


**Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.**

For example, given the dungeon below, the initial health of the knight must be at least 7 if he follows the optimal path `RIGHT-> RIGHT -> DOWN -> DOWN`.

-2 (K)  | -3  |3  
--|---|--
-5  | -10  | 1   
10  | 30  | -5 (P)  

Notes:

The knight's health has no upper bound.
Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.

## Source
[comment]: <> (brief intro to the source of this question. e.g.,)
* from [leetcode 174](https://leetcode.com/problems/dungeon-game)

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
