---

# 🥉 Third Largest Element Finder

This Java program finds the **third largest distinct element** in an integer array using a `TreeSet` to automatically sort and remove duplicates.

---

## ❓ Problem Description

Given an array of integers, the goal is to identify the **third largest distinct number**.

> If fewer than three distinct elements are present, the program returns `-1`.

---

## 📂 Package Structure

```
Assignment2  
└── thirdLargestElement  
    └── ThirdLargestElement.java
```

---

## 🚀 How It Works

1. The user enters the number of elements and then the elements of the array.
2. The program uses a `TreeSet` to store unique elements in **ascending order**.
3. It converts the set into a list and retrieves the element at the `(size - 3)` index.
4. If the set size is less than 3, it returns `-1`.

---

## 🧾 Sample Input/Output

### ✅ Valid Case

```
Enter number of elements: 6
Enter 6 integers:
10 20 30 40 50 60
40
```

### 🔁 Duplicate Elements

```
Enter number of elements: 5
Enter 5 integers:
4 4 2 2 1
-1
```

> Explanation: Only 3 unique elements (4, 2, 1) → third largest is 1.

### ❌ Invalid Input

```
Enter number of elements: 0
Invalid size. Size must be positive.
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/thirdLargestElement
```

### **Step 2: Compile the Program**

```bash
javac ThirdLargestElement.java
```

### **Step 3: Run the Program**

```bash
java ThirdLargestElement.java
```

---
