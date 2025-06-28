---

# 🔁 Palindrome String Checker

This Java program checks whether a given **string** is a **palindrome** or not.

---

## ❓ What Is a Palindrome?

A **palindrome** is a sequence of characters that reads the **same forward and backward** (case-insensitive).

### 🧠 Example:

* ✅ `"madam"` is a palindrome
* ❌ `"hello"` is not a palindrome
* ✅ `"RaceCar"` is a palindrome (case-insensitive)

---

## 📂 Package Structure

```
Assignment2  
└── pallindromeString  
    └── PallindromeString.java
```

---

## 🚀 How It Works

1. The user is prompted to enter a string.
2. The program:

   * Converts the string to lowercase.
   * Compares characters from both ends moving toward the center.
3. If all characters match → returns `1` (Palindrome).
4. If any mismatch occurs → returns `0` (Not a Palindrome).

---

## 🧾 Sample Input/Output

### ✅ Palindrome

```
Enter the string :
madam
1
```

```
Enter the string :
RaceCar
1
```

### ❌ Not a Palindrome

```
Enter the string :
hello
0
```

### ⚠️ Null Input (programmatically)

If the input is `null`, the function will return `0`.

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/pallindromeString
```

### **Step 2: Compile the Program**

```bash
javac PallindromeString.java
```

### **Step 3: Run the Program**

```bash
java PallindromeString.java
```

---
