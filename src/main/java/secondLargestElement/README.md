---

# 🥈 Second Largest Element Finder

This Java program finds the **second largest distinct element** in an array of integers entered by the user.

---

## ❓ What Does It Do?

* Accepts `n` integers from the user.
* Identifies the **second largest unique** element.
* Returns `-1` if no such second largest value exists (e.g., all elements are the same or there's only one element).

---

## 📂 Package Structure

```
Assignment2  
└── secondLargestElement  
    └── SecondLargestElement.java
```

---

## 🚀 How It Works

1. Takes the number of elements (`n`) as input.
2. Reads `n` integers into an array.
3. Uses a **TreeSet** to automatically sort and remove duplicates.
4. Checks if at least 2 distinct elements exist.
5. Returns the second largest by accessing the second last element in the sorted list.

---

## 🧾 Sample Input/Output

### ✅ Valid Input with Distinct Values

```
Enter number of elements: 
5
Enter 5 integers:
10 20 40 30 50
40
```

### ⚠️ Not Enough Distinct Values

```
Enter number of elements: 
3
Enter 3 integers:
5 5 5
-1
```

### ❌ Invalid Input

```
Enter number of elements: 
abc
Invalid input. Please enter a valid integer for size.
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/secondLargestElement
```

### **Step 2: Compile the Program**

```bash
javac SecondLargestElement.java
```

### **Step 3: Run the Program**

```bash
java SecondLargestElement.java
```

---
