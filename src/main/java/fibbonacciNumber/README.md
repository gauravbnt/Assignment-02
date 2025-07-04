---

# 🧮 Nth Fibonacci Number (Modulo 10⁹+7)

This Java program calculates the **Nth Fibonacci number** using an **iterative approach** and returns the result modulo **1000000007** to avoid overflow for large numbers.

---

## ❓ What Is a Fibonacci Number?

A **Fibonacci number** is defined as the sum of the two preceding numbers in the sequence.

**Mathematically:**

```
F(0) = 0  
F(1) = 1  
F(n) = F(n-1) + F(n-2)  for n ≥ 2
```
---

## 📂 Package Structure

```
Assignment2  
└── fibbonacciNumber  
    └── FibbonacciNumber.java
```
---

## 🚀 How It Works

1. The user inputs an integer `n`.
2. The program uses a loop to calculate the `n`th Fibonacci number.
3. The result is returned **modulo 1000000007** to keep the number within integer limits.

---

## 🧾 Sample Input/Output

### ✅ Valid Inputs


```
Enter the nth number : 
7
13
```

```
Enter the nth number : 
50
365010934
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/fibbonacciNumber
```

### **Step 2: Compile the Program**

```bash
javac FibbonacciNumber.java
```

### **Step 3: Run the Program**

```bash
java FibbonacciNumber.java
```

---
