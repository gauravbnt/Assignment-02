
---

# 🔀 ZigZag Array

This Java program rearranges elements of an array in a **zig-zag pattern**, such that:

```
arr[0] < arr[1] > arr[2] < arr[3] > arr[4] < ...
```

---

## ❓ Problem Description

Given an array of distinct integers, convert it into **zig-zag fashion** by rearranging elements so that elements at even indexes are less than their adjacent odd-indexed elements, and elements at odd indexes are greater than their adjacent elements.

---

## 📂 Package Structure

```
Assignment2  
└── zigZagArray  
    └── ZigZagArray.java
```

---

## 🚀 How It Works

1. Iterate over each element up to `n - 1`.
2. At every even index `i`, ensure `arr[i] < arr[i + 1]`.
3. At every odd index `i`, ensure `arr[i] > arr[i + 1]`.
4. Swap elements if they don't meet the zig-zag condition.

---

## 🧾 Sample Input/Output

### ✅ Example

```
Enter size of array: 
5
Enter 5 distinct integers:
4 3 7 8 6
ZigZag Array:
3 4 7 6 8
```

> Explanation:
>
> * `3 < 4 > 7 < 6 > 8` satisfies the zig-zag condition.

---

### ❌ Invalid Input

```
Enter size of array: 
0
Invalid size.
```

```
Enter size of array: 
abc
Invalid Input...
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/zigZagArray
```

### **Step 2: Compile the Program**

```bash
javac ZigZagArray.java
```

### **Step 3: Run the Program**

```bash
java ZigZagArray.java
```

---

