---

# 🔁 Unique Subsets Generator

This Java program generates **all unique subsets** (also known as the power set) from a given array of integers, including duplicates.

---

## ❓ Problem Description

Given an array of integers (which may contain duplicates), generate **all possible unique subsets**.
Each subset must be in non-descending order, and the result must not contain duplicate subsets.

---

## 📂 Package Structure

```
Assignment2  
└── uniqueSubsets  
    └── UniqueSubsets.java
```

---

## 🚀 How It Works

1. Starts with an empty subset.
2. Iterates through each number in the input array.
3. For each existing subset, creates a new one by including the current number.
4. Checks if the new subset already exists to avoid duplicates.
5. Adds all new unique subsets to the result list.

> The input array is **sorted** before generating subsets to handle duplicates properly.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter size of array:
3
Enter elements in array:
1 2 2
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]
```

### ✅ Example 2

```
Enter size of array:
0
[]
```

### ❌ Invalid Input

```
Enter size of array:
-1
Invalid input
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/uniqueSubsets
```

### **Step 2: Compile the Program**

```bash
javac UniqueSubsets.java
```

### **Step 3: Run the Program**

```bash
java UniqueSubsets.java
```

---
