---

# 🔢 Unique Number of Occurrences

This Java program determines whether the **frequency of each element in an array is unique**.

---

## ❓ Problem Description

Given an integer array, you need to check whether the number of times each element occurs is **unique**.

> If **all frequencies are different**, return `true`.
> If **any frequency is repeated**, return `false`.

---

## 📂 Package Structure

```
Assignment2  
└── uniqueNumberOfOccurences  
    └── UniqueNumberOfOccurences.java
```

---

## 🚀 How It Works

1. Accepts the size and elements of the array from the user.
2. Sorts the array to group equal elements together.
3. Counts the frequency of each unique element using a `HashMap`.
4. Stores the frequencies in a `HashSet` and checks for duplicates.
5. If the number of unique elements matches the number of unique frequencies → return `true`, else `false`.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter size: 
6
1 2 2 1 1 3
true
```

> Frequencies: 1 → 3, 2 → 2, 3 → 1
> All frequencies are unique → ✅

---

### ❌ Example 2

```
Enter size: 
6
1 2 2 1 3 3
false
```

> Frequencies: 1 → 2, 2 → 2, 3 → 2
> Duplicate frequencies → ❌

---

### ❌ Invalid Input

```
Enter size: 
0
Invalid input
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/uniqueNumberOfOccurences
```

### **Step 2: Compile the Program**

```bash
javac UniqueNumberOfOccurences.java
```

### **Step 3: Run the Program**

```bash
java UniqueNumberOfOccurences.java
```

---
