---

# 🔢 Smallest and Second Smallest Element Finder

This Java program finds the **smallest** and **second smallest** unique elements from an input array using a `TreeSet`.

---

## ❓ What Does It Do?

* Accepts an array of integers.
* Finds the **smallest** and **second smallest** unique elements.
* If no second smallest exists (like in arrays with all identical elements), returns `-1` for the second smallest.

---

## 📂 Package Structure

```
Assignment2  
└── smallestAndSecondSmallest  
    └── SmallestAndSecondSmallest.java
```

---

## 🚀 How It Works

1. The user inputs the array size and elements.
2. The program stores elements in a `TreeSet` (which automatically sorts and removes duplicates).
3. Converts the `TreeSet` to an array and:

   * Returns `{-1, -1}` if no elements.
   * Returns `{min, -1}` if only one unique element.
   * Otherwise, returns `{min, secondMin}`.

---

## 🧾 Sample Input/Output

### ✅ Case 1: Normal Case

```
Enter the size of the array : 6
Enter 6 integer elements:
8 2 4 2 6 1
Smallest: 1
Second Smallest: 2
```

### ✅ Case 2: Only One Unique Value

```
Enter the size of the array : 3
Enter 3 integer elements:
5 5 5
Smallest: 5
Second Smallest: -1
```

### ❌ Invalid Input

```
Enter the size of the array : abc
❌ Invalid input. Please enter a valid integer.
```

```
Enter the size of the array : -2
❌ Size must be greater than 0.
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/smallestAndSecondSmallest
```

### **Step 2: Compile the Program**

```bash
javac SmallestAndSecondSmallest.java
```

### **Step 3: Run the Program**

```bash
java SmallestAndSecondSmallest.java
```

---
