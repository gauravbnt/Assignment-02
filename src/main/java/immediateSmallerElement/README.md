---

# 🔽 Immediate Smaller Element

This Java program finds the **immediate smaller element** for every element in a given array.

---

## ❓ Problem Statement

Given an array of integers, for each element, **find the next element (on the right)** that is **smaller than the current element**.
If no such element exists, assign **`-1`** for that index.

---

## 📂 Package Structure

```
Assignment2  
└── immediateSmallerElement  
    └── ImmediateSmallerElement.java
```

---

## 🚀 How It Works

1. The user enters the size and elements of the array.
2. The program iterates from index `0` to `n-2`:

   * Compares `arr[i]` with `arr[i+1]`
   * If `arr[i] > arr[i+1]`, store `arr[i+1]` in the result.
   * Else, store `-1`.
3. For the last element, store `-1` (no element to its right).
4. The result array is printed.

---

## 🧾 Sample Input/Output

### ✅ Example

```
Enter the size of array: 
5
Enter the elements of array: 
4 2 1 5 3
Output:
2
1
-1
3
-1
```


### ⚠️ Invalid Input

```
Enter the size of array:
0
Invalid input...
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/immediateSmallerElement
```

### **Step 2: Compile the Program**

```bash
javac ImmediateSmallerElement.java
```

### **Step 3: Run the Program**

```bash
java ImmediateSmallerElement.java
```

---
