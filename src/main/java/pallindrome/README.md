---

# 🔁 Palindrome Number Checker

This Java program checks whether a given number is a **palindrome** or not.

---

## ❓ What Is a Palindrome?

A **palindrome** is a number that reads the **same forward and backward**.

### 🧠 Example:

* ✅ `121` is a palindrome
* ❌ `123` is not a palindrome

---

## 📂 Package Structure

```
Assignment2  
└── pallindrome  
    └── Pallindrome.java
```

---

## 🚀 How It Works

1. Takes a number as input from the user.
2. Reverses the digits of the number.
3. Compares the original and reversed numbers:

   * If they match → returns `"Yes"`.
   * If they don't match → returns `"No"`.
4. If input is negative or invalid → handles appropriately.

---

## 🧾 Sample Input/Output

### ✅ Valid Palindrome

```
Enter the number :
121
Yes
```

### ❌ Not a Palindrome

```
Enter the number :
123
No
```

### ❌ Invalid Input

```
Enter the number :
abc
Invalid Input...
```

```
Enter the number :
-121
Invalid input
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/pallindrome
```

### **Step 2: Compile the Program**

```bash
javac Pallindrome.java
```

### **Step 3: Run the Program**

```bash
java Pallindrome.java
```

---
