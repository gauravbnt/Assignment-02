---

# 🔢 K-th Smallest Distinct Element

This Java program finds the **K-th smallest distinct element** in a given array of integers.

---

## ❓ Problem Statement

Given an array of integers, the task is to return the **K-th smallest distinct element**.
Duplicate elements are ignored when determining the K-th position.

---

## 📂 Package Structure

```
Assignment2  
└── kthSmallestElement  
    └── KthSmallestElement.java
```

---

## 🚀 How It Works

1. The user is prompted to enter the size of the array and then the array elements.
2. The array is inserted into a `TreeSet` to:

   * Remove duplicates.
   * Automatically sort the elements.
3. The `TreeSet` is converted to a list.
4. The program returns the element at index `k-1` if `k` is valid.
5. If `k` is invalid (less than 1 or more than the number of distinct elements), an error is thrown.

---

## 🧾 Sample Input/Output

### ✅ Example

```
Enter number of elements: 
5
Enter 5 integers:
7 10 4 3 20
Enter the value of k:
3
K-th smallest distinct element: 7
```

### ❌ Invalid Input (k too large)

```
Enter number of elements:
3
Enter 3 integers:
10 20 30
Enter the value of k:
5
Exception in thread "main" java.lang.IllegalArgumentException: Invalid value of k: 5
```

### ⚠️ Invalid Array Size

```
Enter number of elements:
0
Invalid size. Size must be positive.
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/kthSmallestElement
```

### **Step 2: Compile the Program**

```bash
javac KthSmallestElement.java
```

### **Step 3: Run the Program**

```bash
java KthSmallestElement.java
```

---
