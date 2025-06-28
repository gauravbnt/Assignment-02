---

# 🔗 Merge Two Strings Alternately

This Java program **merges two strings alternately**, character by character. If the strings are of unequal lengths, the remaining characters of the longer string are appended at the end.

---

## ❓ Problem Description

Given two input strings, merge them **alternately**—one character from each at a time.
If one string is longer than the other, **append the remaining characters** at the end.

---

## 📂 Package Structure

```
Assignment2  
└── mergeTwoStrings  
    └── MergeTwoStrings.java
```

---

## 🚀 How It Works

1. Converts both input strings into character arrays.
2. Alternates characters from both arrays and fills a new result array.
3. Appends remaining characters if one string is longer.
4. Returns the merged string.

---

## 🧾 Sample Input/Output

### 🔁 Equal Length Strings

```
Enter the first string : 
abc
Enter the second string : 
xyz
Output:
axbycz
```

### ➕ Unequal Length Strings

```
Enter the first string : 
ab
Enter the second string : 
wxyz
Output:
awbxyz
```

### ⚠️ One Empty String

```
Enter the first string : 
abc
Enter the second string : 

Output:
abc
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/mergeTwoStrings
```

### **Step 2: Compile the Program**

```bash
javac MergeTwoStrings.java
```

### **Step 3: Run the Program**

```bash
java MergeTwoStrings.java
```

---
