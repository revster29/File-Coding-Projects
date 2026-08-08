# 📌 Big O Notations

**Big O Notations** is a Java project that demonstrates how different algorithms behave as the size of their input increases.

The project uses simple, runnable Java methods to show different **time complexity levels**, helping connect Big O concepts with actual programming examples.

---

## 🧩 Complexity Overview

```text
                    BIG O NOTATIONS
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
      Faster            Moderate          Slower
        │                 │                 │
       O(1)             O(n log n)         O(2ⁿ)
       O(log n)         O(n²)              O(n!)
       O(n)             O(n³)
```

|  Complexity  | Type         | Implemented Example          |
| :----------: | :----------- | :--------------------------- |
|    `O(1)`    | Constant     | First Element, Even Check    |
|  `O(log n)`  | Logarithmic  | Binary Search                |
|    `O(n)`    | Linear       | Maximum Value, Total Sum     |
| `O(n log n)` | Linearithmic | Merge Sort                   |
|    `O(n²)`   | Quadratic    | Bubble Sort, Duplicate Check |
|    `O(n³)`   | Cubic        | Triplet Generation           |
|    `O(2ⁿ)`   | Exponential  | Fibonacci, Subsets           |
|    `O(n!)`   | Factorial    | Permutations                 |

---

## 📂 Project Structure

```text
BigONotations/
│
├── BigONotations.java
│
└── README.md
```

### `BigONotations.java`

Contains the Java methods used to demonstrate each time complexity level.

---

## ⚙️ Algorithms

### `O(1)` — Constant

```text
getFirst()
checkEven()
```

Performs a fixed amount of work regardless of the input size.

### `O(log n)` — Logarithmic

```text
searchBinary()
```

Uses Binary Search to reduce the search range by half during each step.

### `O(n)` — Linear

```text
maxValue()
totalSum()
```

Processes the elements of an array sequentially.

### `O(n log n)` — Linearithmic

```text
mergeSort()
mergeParts()
```

Uses Merge Sort by dividing the array and combining the sorted sections.

### `O(n²)` — Quadratic

```text
bubble()
showDuplicates()
```

Uses nested loops to compare multiple elements in the array.

### `O(n³)` — Cubic

```text
triplets()
```

Uses three nested loops to generate combinations of values.

### `O(2ⁿ)` — Exponential

```text
fibonacci()
generateSubsets()
```

Uses recursive operations where the number of calls can grow rapidly as the input increases.

### `O(n!)` — Factorial

```text
permutations()
```

Uses recursion and swapping to generate every possible arrangement of the elements.

---

## 🎯 Purpose

This project helps develop a practical understanding of **algorithm efficiency** by showing how different approaches can require different amounts of time as the input grows.

It also provides practice with **Java, arrays, loops, recursion, searching, sorting, and algorithm analysis**.
