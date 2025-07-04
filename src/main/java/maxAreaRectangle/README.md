---

# 📐 Max Area of Rectangles

This Java program calculates the **maximum area** among a list of rectangles based on user input.

---

## ❓ Problem Statement

You are given the length and breadth of multiple rectangles.
Your task is to **compute the area of each** and return the **maximum area** among them.

---

## 📂 Package Structure

```
Assignment2  
└── maxAreaRectangle  
    └── MaxAreaRectangle.java
```

---

## 🚀 How It Works

1. The user is asked to input the number of rectangles.
2. For each rectangle, the user provides:

   * Length
   * Breadth
3. The area of each rectangle is calculated using the formula:

   ```
   area = length × breadth
   ```
4. The program tracks and returns the **maximum area**.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter number of rectangles: 3
Enter length and breadth of rectangle 1:
5 10
Enter length and breadth of rectangle 2:
2 7
Enter length and breadth of rectangle 3:
4 4
50
```

### ❌ Invalid Rectangle Input

```
Enter number of rectangles: 2
Enter length and breadth of rectangle 1:
-1 5
Length and breadth must be positive integers.
```

### ❌ Invalid Count Input

```
Enter number of rectangles: 0
Invalid input...
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/maxAreaRectangle
```

### **Step 2: Compile the Program**

```bash
javac MaxAreaRectangle.java
```

### **Step 3: Run the Program**

```bash
java MaxAreaRectangle.java
```

---
