# Homework 2

## Objective

There are three parts to this homework assignment.  First you will implement a graph algorithm.  Second, you will implement a tree algorithm, and finally you will implement a multithread program.

### Graph Alogorithm

Write a java program that reads in graph file of the following format: `<node> <neighbor> <weight> <neighbor> <weight> ... <neighbor> <weight>`.  For example:

```
1 2 2.0 3 1.0
2 1 2.0
3 1 1.0
```

Once the graph has been read into memory, you will calculate and print the totatl distance between two nodes.  You do not need to implement the A* algorithm.  A simple breath first search or depth first algorithm will do.  

Your program should be executed as followed:

```
java homework3.graph <graph file> <start node> <end node>
```
Hint 1: in order to ensure that a node has not been visited, you will need to add a `boolean visited;` flag of some sort.

Hint 2: you should print out the entire path for easier debugging.

### Tree Algorithm

Write a program that reads in a series of numbers from a file then insert the numbers into a tree.  The first number is the root node, and subsequent numbers are either pushed to the left or right side of the parent node.  When finished, your program will perform an in-order traversal to print out the nodes.

The data file should look like this:

```
5 8 2 4 6
``` 
Where 5 is the root node.  8 is the right child of 5, 2 is the left child of 5,  4 is the right child of 2, and 6 is the left child of 8.  So the in-order traversal would look like this:

```
2 4 5 6 8
```

### Multithread program

Update lab8 `DoubleArray.java` with a multithread version.


## What to turn in

You will demonstrate your homework assignment in class.  Note that these are individual assignments.  If you have questions, please direct them to the instructor.

