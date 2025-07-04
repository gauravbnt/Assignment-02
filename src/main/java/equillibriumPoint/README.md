---

# ⚖️ Equilibrium Point

This Java program finds the **equilibrium point** in an array — an index such that the **sum of elements before it** is equal to the **sum of elements after it**.

---

## ❓ What Is an Equilibrium Point?

An **equilibrium point** is an index `i` such that:

```
arr[0] + arr[1] + ... + arr[i-1] == arr[i+1] + arr[i+2] + ... + arr[n-1]
```

Note: Indexing is considered **1-based** in output (i.e., the first index is 1).

---

## 📂 Package Structure

```
Assignment2  
└── equillibriumPoint  
    └── EquillibriumPoint.java
```

---

## 🚀 How It Works

1. Takes input for the size of the array and the array elements.
2. Iterates through the array from index `1` to `n-2`.
3. For each index, calculates:

   * Sum of elements to the left
   * Sum of elements to the right
4. If both sums match, the equilibrium point is found and returned (1-based index).
5. If no point is found, returns `-1`.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter size:
5
Enter the elements:
1 2 4 3 0
Output:
3
```

**Explanation:**
Sum of elements before index 3 → `1 + 2 = 3`
Sum of elements after index 3 → `3 + 0 = 3`
Hence, index `3` is the equilibrium point.

---

### ❌ No Equilibrium Point

```
Enter size:
3
Enter the elements:
1 2 3
Output:
-1
```

---

### ⚠️ Invalid Input

```
Enter size:
0
Output:
Invalid input
```

---

## 💻 How to Run

### **Step 1: Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/equillibriumPoint
```

### **Step 2: Compile the Program**

```bash
javac EquillibriumPoint.java
```

### **Step 3: Run the Program**

```bash
java equillibriumPoint.EquillibriumPoint
```

---
