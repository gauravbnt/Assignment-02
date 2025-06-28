---

# 🔢 Factorial Calculator

This Java program calculates the **factorial of a given number** using iteration.

---

## ❓ What Is a Factorial?

A **factorial** of a number `n` is defined as the product of all positive integers less than or equal to `n`.

**Mathematically:**
`n! = n × (n-1) × (n-2) × ... × 2 × 1`
`0! = 1` (by definition)

---

## 📂 Package Structure

```
Assignment2  
└── factorial  
    └── Factorial.java
```

---

## 🚀 How It Works

1. The user is prompted to enter a number.
2. The program checks if the number is valid (non-negative).
3. If valid, it calculates the factorial using a loop.
4. If the number is negative, it displays an error message.

---

## 🧾 Sample Input/Output

### ✅ Valid Input

```
Enter the number: 5
120
```

```
Enter the number: 0
1
```

### ❌ Invalid Input

```
Enter the number: -3
Number should not be negative...
```

```
Enter the number: abc
Invalid Number...
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd Assignment2/factorial
```

### **Step 2: Compile the Program**

```bash
javac Factorial.java
```

### **Step 3: Run the Program**

```bash
java Factorial.java
```

---

