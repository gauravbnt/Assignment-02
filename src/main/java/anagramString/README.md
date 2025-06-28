---
# 🔤 Anagram String Deletion Count

This Java program calculates the **minimum number of character deletions** required to make two strings anagrams of each other.

---

## ❓ What Is an Anagram?

Two strings are **anagrams** if one can be formed by rearranging the letters of the other.
To make two strings anagrams, you can **only delete characters** from either string.

### 🧠 Example:

* `"abc"` and `"cde"` → Delete `a` and `b` from `"abc"`, and `d` and `e` from `"cde"` → Result: `"c"` and `"c"` → Total deletions = 4

---

## 📂 Package Structure

```
Assignment2  
└── anagramString  
    └── AnagramString.java
```

---

## 🚀 How It Works

1. Takes two strings as input from the user.
2. Builds frequency arrays (size 256 for ASCII).
3. Compares frequencies and calculates total difference.
4. Returns the number of deletions needed to make the strings anagrams.

---

## 🧾 Sample Input/Output

```
Enter first string:
hello

Enter second string:
billion

Output:
6
```

```
Enter first string:
listen

Enter second string:
silent

Output:
0
```

---

## 💻 How to Run

### **Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/anagramString
```

### **Compile the Program:**

```bash
javac AnagramString.java
```

### **Run the Program:**

```bash
java AnagramString.java
```

---
