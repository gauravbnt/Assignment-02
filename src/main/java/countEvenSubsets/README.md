---

# 📊 Count Even Subsets

This Java program calculates the number of **non-empty subsets** that can be formed using only **even and distinct** elements from a given array.

---

## ❓ Problem Statement

You are given an array of integers. Your task is to count how many **non-empty subsets** can be formed using the **distinct even numbers** from that array.

### 📌 Key Points:

* Subsets must contain only **even numbers**.
* Only **distinct even elements** are considered.
* An empty subset is **not** counted.

---

## 📂 Package Structure

```
Assignment2  
└── countEvenSubsets  
    └── CountEvenSubsets.java
```

---

## 🚀 How It Works

1. Read an array from user input.
2. Filter out **distinct even numbers** using a `HashSet`.
3. Use the subset count formula `2^n - 1`, where `n` is the number of distinct even numbers.
4. Print the result.

---

## 🧾 Sample Input/Output

### ✅ Input with Repeated Evens

```
Enter size of array:
6
Enter elements in array:
2 4 2 6 7 9
Count of even subsets:7
```

🧠 **Explanation:**
Distinct even numbers = {2, 4, 6} → Total subsets = 2³ - 1 = 7

---

### ✅ Input with Mixed and Unique Evens

```
Enter size of array:
4
Enter elements in array:
2 4 6 8
Count of even subsets:15
```

🧠 **Explanation:**
2⁴ - 1 = 15

---

## 💻 How to Run

### **Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/countEvenSubsets
```

### **Compile the Program:**

```bash
javac CountEvenSubsets.java
```

### **Run the Program:**

```bash
java CountEvenSubsets.java
```

---
