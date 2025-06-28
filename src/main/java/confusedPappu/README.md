---
# 💰 Confused Pappu

This Java program helps **Confused Pappu** determine how much **extra money** he got when the shopkeeper mistakenly wrote digit `9` instead of `6` while printing the bill.

---

## ❓ Problem Statement

Confused Pappu purchased an item for a given amount. But the shopkeeper mistakenly printed `9` instead of `6` in the amount (e.g., 69 becomes 99). Pappu wants to know how much **extra** money he received due to this confusion.

---

## 📂 Package Structure

```
Assignment2  
└── confusedPappu  
    └── ConfusedPappu.java
```

---

## 🚀 How It Works

1. Accepts the original amount as input.
2. Reconstructs the **converted amount** by replacing every digit `6` with `9`.
3. Calculates the **extra money** by subtracting the original amount from the converted amount.
4. Returns the difference as the result.

---

## 🧾 Sample Input/Output

### 🔢 Input with Digit `6`

```
Enter the amount: 
69
Output:
30
```

🧠 **Explanation**:
Converted amount = 99 (6 is replaced with 9)
Extra = 99 - 69 = 30

---

### 🔢 Input with No Digit `6`

```
Enter the amount: 
123
Output:
0
```

🧠 **Explanation**:
No change in amount, so extra = 0

---


## 💻 How to Run

### **Change Directory**

Navigate to the folder containing the Java file:

```bash
cd src/main/java/confusedPappu
```
### **Compile the Program:**

```bash
javac ConfusedPappu.java
```

### **Run the Program:**

```bash
java ConfusedPappu.java
```

---
