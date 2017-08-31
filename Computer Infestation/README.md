[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# Computer Infestation
Tags: __Easy__, __Microsoft__

You maintain a square grid of computers where each one is only connected to the neighboring computers that are directly adjacent to it, i.e. vertically or horizontally. You have discovered, to your chagrin, that several of your computers have been infected with an alien virus. Your healthy computers become infected if two or more of their adjacent neighbors are infected. Which of your computers end up as infected after the infection has spread as far as it can?

__Input definition__

An input file will contain an n by n square grid of numbers consisting of `0s` and `1s`. Each of the n rows will contain exactly n binary digits and no whitespace between `0s` and `1s`. In the grid, 1s represent infected computers and 0s represent healthy ones. The grid is always square and n can range from `7` to `9`, inclusive.

__Output definition__

Your output should contain an `n by n` square grid of numbers consisting of `0s and 1s`, representing the final state of the infection. As before, `1s` shall represent infected computers and `0s` shall represent healthy ones.
```
Example input

00000000
01010000
00010000
01001000
00010010
00001000
00001001
01000000
Example output

00000000
01111111
01111111
01111111
01111111
01111111
01111111
01111111
```

## Source
[comment]: <> (brief intro to the source of this question. e.g.,)
* Microsoft code competition

## Complexity/Analysis
The optimal solution can achieve ___O(N)___ time and ___O(N)___ space. Or another solution and achieve xxxxxxx.

## Notes
The possible corner case includes
* xxxxxxx
* xxxxxxx
* .....

Using xxx will result stack overflow. xxxxxxx

You can also add the guidance for how to use the test cases.
