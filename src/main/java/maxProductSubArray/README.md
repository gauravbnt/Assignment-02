---

# ✖️ Maximum Product Subarray 

This Java program calculates the **maximum product** of a subarray from a given array of integers, including handling **negative numbers** by ignoring the least contributing negative value.

---

## ❓ Problem Statement

You are given an array of integers.
Your task is to **find the maximum product** that can be obtained from a subarray (a contiguous or non-contiguous sequence) after:

* Removing the **least-impact negative** if the total count of negative numbers is odd.
* Ignoring 0s and 1s in multiplication, as they do not increase the product.

---

## 📂 Package Structure

```
Assignment2  
└── maxProductSubArray  
    └── MaxProductSubArray.java
```

---

## 🚀 How It Works

1. Sorts the array to easily identify and remove the largest negative (if needed).
2. Removes the least-impact negative number if the total number of negatives is odd.
3. Skips 0 and 1 in the final product computation.
4. Returns the product of the remaining elements.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter size: 
5
-1 -2 -3 4 0
24
```

Explanation: `-1 * -2 * -3 * 4 = 24` (removes 0 and 1 from multiplication)

---

### ❌ Invalid Input

```
Enter size: 
0
Invalid input
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/maxProductSubArray
```

### **Step 2: Compile the Program**

```bash
javac MaxProductSubArray.java
```

### **Step 3: Run the Program**

```bash
java MaxProductSubArray.java
```

---
