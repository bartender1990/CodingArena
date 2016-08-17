#Greedy Problems

##### Greedy problems look at the current optimal solution and not the global optimal to take a decision. They have the following two properties:
 
1. Greedy Choice Property

    Globally optimal solution can be made by making a locally optimal solution.Iteratively make a greedy choice 
    and reduce the problem.

2. Optimal Substructure Property

	Optimal solution to problems comes by solving solving subproblems optimally.
	
Application of Greedy Approach

    Topological Sort
    Heap Sort
    Huffman Coding
    Prim's Algorithm
    Kruskal's Algorithm
    Dijkstra's Algorithm
    Coin Change Problem
    Fractional Knapsack
    Disjoint Sets Unions by size or rank
    Job Scheduling Algorithms
    Approximation Algorithms

Problem 1

1. Construct a Character Coding for a set of messages to encode an alphabet such that the frequently occurring characters use fewer bits using Huffman Algorithm. No two character codes should be exact prefixes of each other.For each c which belongs to alphabet A, Minimize sum of frequency(c)* length of binarycode used to represent c.
	