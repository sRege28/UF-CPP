[comment]: <> (This is a comment, it will not be included. For every question commit to the repository, you should put this readme file in the question/problem folder as a readme file, rename it to README.md)

# Packing It Up
Tags: __Easy__, __Microsoft__

The Contoso Analysis Platform (CAP) stores log files in fixed-size structures called "Nodes", but each instance of the CAP uses different settings to optimize how the incoming logs are stored in each of the nodes.

To handle transforming the incoming nodes, there is a frontend called the Gateway that Outputs Written Nodes (GOWN). Its job is to take the incoming nodes and rewrite them into the format expected by the CAP. To accomplish this, it needs to take in a collection of incoming nodes and repartition them into nodes having the expected number of slots. In addition, some CAP instances want empty slots to be removed from Nodes; other instances, however, expect these empty entries to be preserved as they are used during analysis.

Can you help us get the CAP & GOWN working together?

__Input definition__

An input file for this problem will contain one header line, followed by a set of input Nodes. The header line will contain an integer specifying how many slots each output node should contain, followed by a colon, and a flag indicating whether or not empty slots should be removed.

Each individual input Node will consist of a number of "slots", where each slot is separated from the next slot by a newline (any empty slots will also be on their own line). Each Node will begin with a [ and end with a ]. A pair of these brackets will also enclose the full set of given input nodes and the brackets will always be on their own lines (which may also contain whitespace). For example, the following Node contains m slots:
```
[
    Line 1
    Line 2
    ...
    Line m
]
```
Further, if the input contained N individual Node objects, they would be given in the the following format, where each Node would consist of m+2 lines of the format given above:
```
[
    Node 1
    Node 2
    ...
    Node N
]
```
Because the set of input nodes may contain whitespace for readability in a text editor, any of the following would be valid input strings (where \n and \t represent a newline and tab, respectively):
```
2:True\n[\n[\nA\n\B\n\n]\n[\n\n\nC\n]\n]

2:True\n[\n  [\n    A\n    B\n    \n    ]\n  [\n    \n    \n    C\n  ]\n]

2:True\n[\n\t[\n\tA\n\tB\n\t\n\t]\n\t[\n\t\n\t\n\tC\n\t]\n]
```
__Output definition__

Your output should have four header lines, followed by the expected set of output Nodes. More specifically, your output should be:
```
int OutputNodeCount
int NodeCountDifference
int EmptySlotDifference
int EmptySlotCount
Node[] OutputNodes
```
__Where:__

OutputNodeCount is the total number of Nodes written to OutputNodes.

NodeCountDifference is the difference between the count of Nodes in the given input and correct output. This number should be positive if there are more Nodes in OutputNodes than in InputNodes, and should be negative if there are fewer.

EmptySlotDifference is the difference between the combined number of empty slots across all of the Nodes in InputNodes and OutputNodes. This number should be positive if there are more empty slots in all of the Nodes in OutputNodes than in InputNodes, and should be negative if there are fewer.

EmptySlotCount is the total number of empty slots contained across all of the Nodes in OutputNodes.

OutputNodes is the resulting set of output Nodes.

It is noted that all output nodes should remove leading and trailing whitespace from each line. For example, if an input slot contained " demo\t", the corresponding output slot should just be "demo" in the output node.

__Example input__
```
3:True
[
	[
		Lorem ipsum dolor sit amet
		consectetur adipiscing elit

	]
	[
		sed do eiusmod tempor incididunt
		ut labore et dolore magna aliqua
		Ut enim ad minim veniam
	]
	[
		quis nostrud exercitation ullamco


	]
]
```
__Example output__
```
2
-1
-3
0
[
[
Lorem ipsum dolor sit amet
consectetur adipiscing elit
sed do eiusmod tempor incididunt
]
[
ut labore et dolore magna aliqua
Ut enim ad minim veniam
quis nostrud exercitation ullamco
]
]
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
