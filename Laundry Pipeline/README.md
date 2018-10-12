[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# Laundry Pipeline
Tags: __Greedy__, __Medium__, __Microsoft__

Contoso is considering branching its business into a new industry: dry cleaning. Contoso, however, won't just enter a new industry without a ground-breaking strategy. Contoso's new strategy for dry cleaning will be a multi-step process that requires a clothing item to go through a series of machines, much like how home laundry goes through the washer followed by the dryer. The new process, however, will require many more machines and each machine will take a fixed amount of time to process a load.

For example, let's assume 100 loads of laundry need to be processed through 4 machines in order. The time to run each load in the machines are 1, 1, 1, and 3 minutes, in that order. Since the machines run independently, once the first load is done in the first machine, it will be moved to the second machine, and the second load will immediately be started in the first machine. This starts the pipeline. If a machine completes a load, the next machine must be empty for the current load to progress. All loads move instantaneously. For this example, the 100 loads of laundry will complete in 303 minutes.

A new technology has now been created that allows one to combine any number of consecutive machines into a single machine; the new combined machine's processing time is equal to the sum of the original machines' processing times. The capacity of each machine remains the same. For the above example, you could reduce the pipeline to two machines with times of 3 and 3. In that case, the time to complete 100 loads with the reduced pipeline is the same: 303 minutes. If, however we reduced the pipeline to a single machine with a time of 6, the time to complete 100 loads would be 600 minutes. Ouch!

Your program should compute the minimum number of machines the pipeline could be without increasing the time to complete a given number of loads.

__Input definition__

An input file for this problem will contain two lines. The first line will be two integers, N and M, the number of machines in the pipeline and number of loads to be processed, respectively. The next line of input will contain N space-separated integers where the i-th integer indicates the time to process a load in the i-th machine.

The following bounds apply:
* 1 <= N <= 1000
* N <= M <= 2 * N

Machine load processing times can range from _1 to 100_, inclusive.

__Output definition__

Your output should contain a single integer indicating the minimum number of machines that can be used to complete M loads in the pipeline, without increasing the processing time.

__Example input__
```
4 100
1 1 1 3
```
Example output `2`

The output for three input test case files:
1. 651
2. 635
3. 659

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
