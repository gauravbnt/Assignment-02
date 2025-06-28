---

# 🔗 Count Pairs with Given Sum

This Java program counts the number of **unique pairs** in an array whose **sum equals a given target value `k`**.

---

## ❓ Problem Statement

Given an array of integers and a target sum `k`, count all pairs `(i, j)` such that:

* `arr[i] + arr[j] == k`
* `i < j` (no duplicate or reversed pairs)

---

## 📂 Package Structure

```
Assignment2  
└── countPairsWithGivenSum  
    └── CountPairsWithGivenSum.java
```
---

## 🚀 How It Works

1. Reads the array size and its elements from user input.
2. Reads the target sum `k`.
3. Iterates through the array using **two nested loops** to find all valid pairs.
4. Increments the count for each valid pair found.

---

## 🧾 Sample Input/Output

### ✅ Example 

```
Enter size of array :
4
Enter 4 integers:
1 2 3 4
Enter the sum to check  :
5
Output:
2
```

**Explanation:**
Valid pairs are (1,4) and (2,3)

---

### ⚠️ Invalid Size Input

```
Enter size of array :
-1
Output:
Invalid size. Size must be positive.
```

---

## 💻 How to Run

### **Compile the Program:**

```bash
javac CountPairsWithGivenSum.java
```

### **Run the Program:**

```bash
java CountPairsWithGivenSum.java
```

---
