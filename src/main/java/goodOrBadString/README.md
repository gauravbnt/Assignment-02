---

# ✅ Good or Bad String Checker

This Java program checks whether a given string is **"Good"** or **"Bad"** based on the **sequence of vowels and consonants**.

---

## ❓ Problem Statement

A string is considered:

* **Bad** if it contains:

  * **More than 5 consecutive vowels**, or
  * **More than 3 consecutive consonants**
* Otherwise, it is considered **Good**.

The character `'?'` can be treated as **either a vowel or a consonant**.

---

## 📂 Package Structure

```
Assignment2  
└── goodOrBadString  
    └── GoodOrBadString.java
```

---

## 🚀 How It Works

1. Takes a string input from the user.
2. Converts the string to lowercase.
3. Iterates through the string checking:

   * For **vowel streaks > 5**
   * For **consonant streaks > 3**
   * Treats `'?'` as a wildcard that can fit either category.
4. Returns:

   * `0` → if **bad**
   * `1` → if **good**

---

## 🧾 Sample Input/Output

### ✅ Good String

```
Enter string:
aebcdfg
1
```

### ❌ Bad String (More than 5 vowels)

```
Enter string:
aeiouae
0
```

### ❌ Bad String (More than 3 consonants)

```
Enter string:
bcdfa
0
```

### ⚠️ Invalid Input

```
Enter string:

Invalid input
0
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/goodOrBadString
```

### **Step 2: Compile the Program**

```bash
javac GoodOrBadString.java
```

### **Step 3: Run the Program**

```bash
java GoodOrBadString.java
```

---
