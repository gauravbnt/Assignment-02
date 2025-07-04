
---

# 🧮 Sieve of Eratosthenes

This Java program prints all **prime numbers up to a given number N** using the **Sieve of Eratosthenes** algorithm.

---

## ❓ What Is the Sieve of Eratosthenes?

The **Sieve of Eratosthenes** is an efficient algorithm to find all prime numbers up to a given limit.

* It works by iteratively marking the **multiples of each prime number** starting from 2.
* Remaining unmarked numbers are primes.

---

## 📂 Package Structure

```
Assignment2  
└── sieveOfEratosthenes  
    └── SieveOfEratosthenes.java
```

---

## 🚀 How It Works

1. The user inputs a number `N`.
2. The program creates a boolean array where `true` indicates a number is initially assumed to be prime.
3. It marks all non-prime numbers by marking multiples of every prime starting from 2.
4. All indices that remain `true` are collected as prime numbers.

---

## 🧾 Sample Input/Output

### ✅ Valid Input

```
Enter the range  : 
10
[2, 3, 5, 7]
```

```


### ❌ Invalid Input

```
Enter the range  : 
-5
Invalid input..
```

```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/sieveOfEratosthenes
```

### **Step 2: Compile the Program**

```bash
javac SieveOfEratosthenes.java
```

### **Step 3: Run the Program**

```bash
java SieveOfEratosthenes.java
```

---
