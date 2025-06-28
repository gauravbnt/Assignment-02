---

# 🔍 Prime Number Checker

This Java program checks whether a given **integer** is a **prime number** or not.

---

## ❓ What Is a Prime Number?

A **prime number** is a number that is **greater than 1** and has **no positive divisors** other than `1` and itself.

### 🧠 Examples:

* ✅ `2`, `3`, `5`, `7`, `11` are prime numbers
* ❌ `0`, `1`, `4`, `6`, `8`, `9`, `10` are not

---

## 📂 Package Structure

```
Assignment2  
└── prime  
    └── PrimeNo.java
```

---

## 🚀 How It Works

1. Prompts the user to enter a number.
2. Validates if the input is an integer.
3. Checks if the number is:

   * Less than or equal to 1 → Not Prime (`0`)
   * Divisible by any number from `2` to `num/2` → Not Prime (`0`)
   * Otherwise → Prime (`1`)

---

## 🧾 Sample Input/Output

### ✅ Prime Input

```
Enter the number : 
7
1
```

### ❌ Not a Prime

```
Enter the number : 
4
0
```

### ⚠️ Invalid Input

```
Enter the number : 
abc
Invalid Number
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/prime
```

### **Step 2: Compile the Program**

```bash
javac PrimeNo.java
```

### **Step 3: Run the Program**

```bash
java PrimeNo.java

```

---
