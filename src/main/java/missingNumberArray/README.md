---

# 🔍 Find the Missing Number in Array

This Java program finds the **missing number** in an array of size `n-1` that should contain all integers from `1` to `n`.

---

## ❓ Problem Description

You are given an array containing `n-1` distinct numbers from `1` to `n`.
Your task is to **identify the missing number**.

---

## 🧠 Example

For `n = 5`, and input array: `[1, 2, 3, 5]`
Missing number is `4`.

---

## 📂 Package Structure

```
Assignment2  
└── missingNumberArray  
    └── MissingNumberArray.java
```

---

## 🚀 How It Works

1. Calculates the expected sum of the first `n` natural numbers using the formula:
   `expectedSum = n * (n + 1) / 2`
2. Computes the actual sum of elements in the array.
3. Returns the difference: `expectedSum - actualSum` → This is the missing number.

---

## 🧾 Sample Input/Output

### ✅ Valid Input

```
Enter number of elements: 5
Enter 5 integers:
1 2 3 5
Output:
4
```

### ❌ Invalid Size

```
Enter number of elements: 0
Output:
Invalid size. Size must be positive.
```

### ❌ Invalid Element Input

```
Enter number of elements: 4
Enter 4 integers:
1 2 a
Output:
Invalid number entered..
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/missingNumberArray
```

### **Step 2: Compile the Program**

```bash
javac MissingNumberArray.java
```

### **Step 3: Run the Program**

```bash
java MissingNumberArray.java
```

---
