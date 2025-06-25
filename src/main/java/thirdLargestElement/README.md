
# 📊 Third Largest Element

This Java program finds the **third largest unique element** in a given list of integers. It uses a `TreeSet` to automatically sort and remove duplicates, ensuring accurate results even with repeated values.

---

## ❓ Problem Statement

Given an array of integers, your task is to find the **third largest unique element**. If there are fewer than three unique elements, the program returns `-1`.

---

## ✅ Example

```

Input:
Enter number of elements: 6
Enter 6 integers:
2 5 3 5 8 7

Output:
5

```
```

Input:
Enter number of elements: 2
Enter 2 integers:
1 1

Output:
-1

```

---

## 📂 Package Structure

```

ThirdLargestProject/
└── thirdLargestElement/
└── ThirdLargestElement.java


````

---

## 🧠 How It Works

1. Takes an array of integers from user input.
2. Uses a `TreeSet` to:
   - Automatically sort elements in ascending order.
   - Remove duplicates.
3. If fewer than 3 unique elements exist, it returns `-1`.
4. Otherwise, it returns the 3rd largest unique number (from the end of the list).

---

## 💻 How to Compile & Run

### 📦 Compile
```bash
javac thirdLargestElement/ThirdLargestElement.java
````

### ▶️ Run

```bash
java thirdLargestElement.ThirdLargestElement
```

---

## 🔒 Input Validations

* Checks if array size is a **positive integer**.
* Validates that each element entered is a valid integer.
* If any input is invalid, appropriate error messages are displayed.

---
