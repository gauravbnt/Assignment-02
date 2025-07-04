---

# 🔍 First and Last Occurrences Finder

This Java program finds the **first and last index** of a given element in an array.

---

## ❓ What Does It Do?

The program takes an array and a number as input and returns the **first** and **last** positions of the number in the array.

If the number is **not found**, it returns `-1`.

---

## 📂 Package Structure

```
Assignment2  
└── firstAndLastOccurences  
    └── FirstAndLastOccurences.java
```

---

## 🚀 How It Works

1. Takes array size and elements as input.
2. Accepts a number to search for.
3. Iterates through the array to:

   * Record the **first** index when the number appears.
   * Update the **last** index each time it is found again.
4. Prints the first and last index.
5. If not found, prints `-1`.

---

## 🧾 Sample Input/Output

### ✅ Element Found

```
Enter size of array: 
6
Enter array elements: 
1 2 3 2 5 2
Enter the number to find: 
2
First index: 1
Last index: 5
```

### ❌ Element Not Found

```
Enter size of array: 
5
Enter array elements: 
10 20 30 40 50
Enter the number to find: 
25
-1
```

### ⚠️ Invalid Size Input

```
Enter size of array: 
0
Invalid size.
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/firstAndLastOccurences
```

### **Step 2: Compile the Program**

```bash
javac FirstAndLastOccurences.java
```

### **Step 3: Run the Program**

```bash
java FirstAndLastOccurences.java
```

---
