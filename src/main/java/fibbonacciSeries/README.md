---

# 🔢 Fibonacci Series Generator

This Java program prints the **Fibonacci series up to the Nth term** using iteration.

---

## ❓ What Is a Fibonacci Series?

A **Fibonacci series** is a sequence of numbers where:

* The first two terms are `1` and `1`.
* Each subsequent term is the sum of the previous two.

**Mathematically:**

```
F(1) = 1  
F(2) = 1  
F(n) = F(n-1) + F(n-2) for n ≥ 3
```

---

## 📂 Package Structure

```
Assignment2  
└── fibbonacciSeries  
    └── FibbonacciSeries.java
```

---

## 🚀 How It Works

1. The user is prompted to enter a number `n`.
2. The program generates the first `n` terms of the Fibonacci series.
3. It returns the series as an array and prints it.

---

## 🧾 Sample Input/Output

### ✅ Valid Inputs

```
Enter the nth number : 
5
1 1 2 3 5
```

```
Enter the nth number : 
1
1
```
---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/fibbonacciSeries
```

### **Step 2: Compile the Program**

```bash
javac FibbonacciSeries.java
```

### **Step 3: Run the Program**

```bash
java FibbonacciSeries.java
```

---
