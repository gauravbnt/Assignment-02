# 🔢 Smallest and Second Smallest Element

This Java program identifies the **smallest** and **second smallest unique elements** in a given list of integers. It uses a `TreeSet` to automatically remove duplicates and maintain a sorted order.

---

## ❓ Problem Statement

Given an array of integers, find the **smallest** and **second smallest** unique elements.  
- If the array contains only one unique element, the second smallest will be `-1`.
- If no valid input is provided, both values will be `-1`.

---

## ✅ Example

```

Input:
Enter the size of the array : 6
Enter 6 integer elements:
3 1 4 1 5 9

Output:
Smallest: 1
Second Smallest: 3

```
```

Input:
Enter the size of the array : 1
Enter 1 integer elements:
7

Output:
Smallest: 7
Second Smallest: -1

```
```

Input:
Enter the size of the array : 4
Enter 4 integer elements:
5 5 5 5

Output:
Smallest: 5
Second Smallest: -1

```

---

## 📂 Package Structure

```

SmallestProject/
└── smallestAndSecondSmallest/
└── SmallestAndSecondSmallest.java
└── README.md

````

---

## 🧠 How It Works

1. The user enters the number of elements in the array.
2. The program reads the array while validating all inputs.
3. It converts the array into a `TreeSet` to:
   - Sort elements in ascending order
   - Remove duplicates
4. Based on the size of the sorted set:
   - Returns smallest and second smallest
   - Or `-1` where applicable

---

## 💻 How to Compile & Run

### 📦 Compile
```bash
javac smallestAndSecondSmallest/SmallestAndSecondSmallest.java
````

### ▶️ Run

```bash
java smallestAndSecondSmallest.SmallestAndSecondSmallest
```

---

## 🔒 Input Validation

* Ensures the array size is a **positive integer**.
* Prompts again if non-integer or invalid values are entered.
* Validates each array element individually.

---


