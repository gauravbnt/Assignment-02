---

# 🔍 Check for Subsequence

This Java program checks whether the **first string** is a **subsequence** of the **second string**.

---

## ❓ What Is a Subsequence?

A **subsequence** of a string is a sequence that appears in the same **relative order**, but not necessarily **contiguously**.

### 🧠 Example:

* `"abc"` is a subsequence of `"a1b2c3"` ✅
* `"abc"` is **not** a subsequence of `"acb"` ❌

---

## 📂 Package Structure

```
Assignment2  
└── checkForSubsequence  
    └── CheckForSubsequence.java
```

---

## 🚀 How It Works

1. Takes two strings as input.
2. Traverses the first string character by character.
3. For each character in the first string, it searches for it in the second string starting from the last matched position.
4. If all characters of the first string are found in the second string in order, it returns `1` (true). Otherwise, returns `0`.

---

## 🧾 Sample Input/Output

### ✅ Valid Subsequence

```
Enter the first string :
abc
Enter the second string :
a1b2c3
Output:
1
```

### ❌ Not a Subsequence

```
Enter the first string :
abc
Enter the second string :
acb
Output:
0
```

### ⚠️ Invalid Input

```
Enter the first string :
<empty>
Enter the second string :
<empty>
Output:
Invalid Input...
```

---

## 💻 How to Run

### **Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/checkForSubsequence
```

### **Compile the Program:**

```bash
javac CheckForSubsequence.java
```

### **Run the Program:**

```bash
java CheckForSubsequence.java
```

---
