# 🛡️ Data Structure Gatekeeper

`Data Structure Gatekeeper` is a basic Java program that simulates how data is inspected and processed using core programming logic. It focuses on handling fixed-size arrays, applying conditions, and organizing output without using advanced data structures.

---

## 🚀 Program Highlights

* **Selective Data Processing**
  Identifies and extracts values that meet a defined rule from a given dataset.

* **Value Tracking Mechanism**
  Detects how often a specific number appears within the array.

* **Clean Output Display**
  Presents results in a structured and readable console format.

---

## 📊 Process Overview

### 1. Data Selection (`filterQualified`)

The program follows a controlled approach when handling arrays:

* First, it scans the dataset to determine how many values satisfy the condition
* Then, it creates a new array sized exactly for those values
* Finally, it transfers the qualified data into the new structure

---

### 2. Value Counting (`countValue`)

* Iterates through each element of the array
* Checks if it matches the chosen target
* Keeps track of the total matches and returns the result

---

## 💻 File Structure

```id="z91mdc"
📁 project-folder
└── 📄 DataStructureGatekeeper.java
     ├── main()
     ├── filterQualified()
     ├── countValue()
     └── printArray()
```

---

## ⚙️ How to Run

Make sure Java is installed on your system.

```id="n6ax2p"
javac DataStructureGatekeeper.java
java DataStructureGatekeeper
```

---

## 🖥️ Example Output

```id="t3r8vm"
========================================
     DATA STRUCTURE GATEKEEPER SYSTEM
========================================

Input Data      : [ 14 | 21 | 18 | 9 | 30 | 18 | 25 ]
Qualified Data  : [ 21 | 18 | 30 | 18 | 25 ]

----------------------------------------
Value Checked   : 18
Occurrences     : 2
----------------------------------------
Process Complete.
```

