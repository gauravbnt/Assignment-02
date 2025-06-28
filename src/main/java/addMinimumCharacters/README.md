---
# ➕ Add Minimum Characters

This Java program determines the **minimum number of characters that need to be added at the beginning** of a string to make it a **palindrome**.

---

## ❓ What Does It Do?

Given a string `str`, the program finds the minimum number of characters to be added at the **front** of the string so that the resulting string becomes a **palindrome**.

### 🧠 What is a Palindrome?

A **palindrome** is a string that reads the same forwards and backwards.
**Examples:** `madam`, `racecar`, `aabbaa`

---

## 📂 Package Structure

```
Assignment2  
└── addMinimumCharacters  
    └── AddMinimumCharacters.java
```

---

## 🚀 How It Works

1. The user inputs a string.
2. The program checks each suffix of the string to see if it's a palindrome.
3. The first palindromic suffix found determines how many characters need to be added at the front.
4. The number of required characters is printed.

---

## 🧾 Sample Input/Output

```
Enter the string:
aacecaaa
2
```

```
Enter the string:
racecar
0
```

---

## 💻 How to Run

### **Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/addMinimumCharacters
```
### **Compile the Program:**

```bash
javac AddMinimumCharacters.java
```

### **Run the Program:**

```bash
java AddMinimumCharacters.java
```

---
