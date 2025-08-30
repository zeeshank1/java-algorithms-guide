# Algorithms Using Java 8

This repository contains implementations of various algorithms in Java 8. It is structured to help learners and developers understand, implement, and practice algorithms commonly used in software development, competitive programming, and technical interviews.

## 1. Algorithms Must Know:

These are foundational algorithms that every developer should be familiar with:

1. **Sorting Algorithms**: Quick Sort, Merge Sort, Heap Sort, Counting Sorted.
2. **Searching Algorithms**: Binary Search, Linear Search.  
3. **Dynamic Programming**: Knapsack, Longest Common Subsequence, Fibonacci.  
4. **Greedy Algorithms**: Activity Selection, Huffman Coding.  
5. **Divide and Conquer**: Merge Sort, Quick Sort, Binary Search.  
6. **Graph Algorithms**: BFS, DFS, Topological Sorting.  
7. **Tree Traversal Algorithms**: Inorder, Preorder, Postorder.  
8. **Hashing**: Collision Resolution Techniques.  
9. **Bit Manipulation**: Basic Operations, XOR Tricks.  
10. **Recursion and Backtracking**: N-Queens, Sudoku Solver.  
11. **String Matching**: KMP, Rabin-Karp, Z-Algorithm.  
12. **Matrix Manipulation**: Transpose, Rotate, Spiral.  

---

## 2. Algorithms Good to Know for Top Companies:

These algorithms are frequently asked in interviews at top companies:

1. **Segment Tree Algorithms**: Range Query, Range Update.  
2. **Binary Indexed Tree / Fenwick Tree**: Point Update, Range Query.  
3. **Graph Algorithms**: Dijkstra, Bellman-Ford, Floyd-Warshall.  
4. **Minimum Spanning Tree**: Kruskal’s, Prim’s.  
5. **Dynamic Programming (Advanced Problems)**: Matrix Chain Multiplication, Subset Sum.  
6. **Network Flow Algorithms**: Ford-Fulkerson, Edmonds-Karp.  
7. **Advanced Recursion and Memoization**: Tiling Problems, Catalan Numbers.  
8. **Number Theory Algorithms**: GCD, LCM, Sieve of Eratosthenes.  
9. **Bitmasking**: DP + Bitmasking Problems.  
10. **2-Pointer and Sliding Window Techniques**.  
11. **Monotonic Stack / Queue Algorithms**.  
12. **Convex Hull Algorithms**: Graham Scan, Jarvis March.  

---

## 3. Algorithms Required for Tier-1 Companies:

These advanced algorithms are essential for solving complex problems in technical interviews at Tier-1 companies:

1. **Graph Algorithms**: Dijkstra, A*, Bellman-Ford, Floyd-Warshall, Johnson's Algorithm.  
2. **Dynamic Programming (Advanced)**: LIS, LCS, DP on Trees/Graphs, DP with Bitmasking.  
3. **Advanced Greedy Algorithms**: Job Scheduling, Huffman Coding.  
4. **Graph Search & Shortest Path**: A*, Bidirectional BFS.  
5. **String Algorithms**: KMP, Z-Algorithm, Manacher’s Algorithm for Palindromes.  
6. **Advanced Recursion and Backtracking**: Hamiltonian Path, Subset Sum, Permutations.  
7. **Matrix Exponentiation**.  
8. **Graph Cycle Detection**: Union-Find, Tarjan’s Algorithm.  
9. **Tarjan’s Algorithm**: Strongly Connected Components.  
10. **Kadane’s Algorithm**: For Maximum Subarray Problem.  
11. **Sliding Window Algorithms**: For optimization problems.  
12. **Trie-Based Algorithms**: For prefix searching, autocomplete.  
13. **Shortest Path in Weighted Graphs**: Dijkstra, A*.  
14. **Heavy-Light Decomposition**: For Tree Queries.  

---

## 4. Additional Topics to Explore:

These topics are not explicitly mentioned above but are worth exploring for a deeper understanding of algorithms:

1. **Disjoint Set Union (Union-Find)**: Path compression, Union by rank.  
2. **Topological Sorting**: Using Kahn’s Algorithm.  
3. **Computational Geometry**: Line intersection, Closest pair of points.  
4. **Advanced Number Theory**: Modular arithmetic, Modular exponentiation, Chinese Remainder Theorem.  
5. **Game Theory**: Minimax Algorithm, Alpha-Beta Pruning.  
6. **Randomized Algorithms**: Reservoir Sampling, Randomized Quick Sort.  
7. **Approximation Algorithms**: For NP-hard problems.  

---

### Folder Structure:

The repository is organized as follows:

```plaintext
algorithms-java8/
├── .gitignore
├── README.md
├── pom.xml OR build.gradle
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── zeeshank1/
│   │               └── algorithms/
│   │                   ├── sorting/
│   │                   │   ├── QuickSort.java
│   │                   │   ├── MergeSort.java
│   │                   │   └── ...
│   │                   ├── searching/
│   │                   │   ├── BinarySearch.java
│   │                   │   └── ...
│   │                   ├── dynamicprogramming/
│   │                   │   ├── Knapsack.java
│   │                   │   └── ...
│   │                   ├── greedy/
│   │                   ├── divideandconquer/
│   │                   ├── graph/
│   │                   ├── tree/
│   │                   ├── hashing/
│   │                   ├── bitmanipulation/
│   │                   ├── recursion/
│   │                   ├── stringmatching/
│   │                   ├── matrix/
│   │                   ├── segmenttree/
│   │                   ├── fenwicktree/
│   │                   ├── networkflow/
│   │                   ├── numbertheory/
│   │                   ├── bitmasking/
│   │                   ├── twopointer/
│   │                   ├── monotonic/
│   │                   ├── convexhull/
│   │                   ├── trie/
│   │                   ├── heavylightdecomposition/
│   │                   └── utils/
│   │                       └── Helper.java
│   └── test/
│       └── java/
│           └── com/
│               └── zeeshank1/
│                   └── algorithms/
│                       └── (Mirrors the main structure for unit tests)
├── docs/
│   ├── diagrams/
│   ├── notes/
│   │   ├── sorting.md
│   │   ├── dp.md
│   │   └── ...
│   └── cheatsheets/
├── .github/
│   └── workflows/
│       └── maven.yml (CI/CD GitHub Actions for build/test)
```

---

## Contributing:

Contributions are welcome! Feel free to submit pull requests for new algorithms, optimizations, or bug fixes.

