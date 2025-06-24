# Confused Pappu

This Java program solves the **"Confused Pappu"** problem where Pappu mistakenly treats the digit `6` as `9` while calculating the returned amount to customers.


## ❓ Problem Statement

Pappu works in a billing department and is confused between digits `6` and `9`. Given the correct amount to return, your task is to calculate the **maximum possible extra amount** that Pappu might return due to this confusion.


##  Example

If the actual amount is `56`,  
Pappu may interpret it as `59`,  
Thus, **Extra amount = 59 - 56 = 3**


## 📂 Package Structure

Assignment2
└── confusedPappu
└── ConfusedPappu.java



## 🚀 How It Works

1. The user inputs the original amount.
2. The `revAmount()` function:
   - Converts every `6` to `9` in the number.
3. The `extraAmount()` function:
   - Subtracts the original amount from the converted one.
4. The result (extra amount returned due to the confusion) is printed.


## 🧾 Sample Input/Output

Enter the amount: 56
3

Enter the amount: 666
333

Enter the amount: 123
0


## 💻 How to Run

**Compile the program:**

javac ConfusedPappu.java

**Run the program:**

java confusedPappu.ConfusedPappu
