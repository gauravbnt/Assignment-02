---

# 📈 Stock Buy and Sell - Part One

This Java program finds the **best days to buy and sell stocks** to maximize profit based on a given price array.

---

## ❓ Problem Description

You are given an array where the `i-th` element represents the price of a stock on day `i`. Your goal is to **find all the intervals (buy and sell days)** where buying on one day and selling on a later day will yield a profit.

---

## 📂 Package Structure

```
Assignment2  
└── stockBuyAndSellPartOne  
    └── StockBuyAndSellPartOne.java
```

---

## 🚀 How It Works

1. The program takes the stock prices for each day.
2. It scans through the array:

   * Tracks a **start index** where a potential profit might begin.
   * If the price drops the next day, it considers selling the stock on the current day.
   * Records the buy and sell indices if profitable.
3. At the end, prints all such intervals.

If no profitable interval exists, it prints `"No Profit"`.

---

## 🧾 Sample Input/Output

### ✅ Case 1: Profitable Days Exist

```
Enter size: 
7
100 180 260 310 40 535 695
0 3
4 6
```

➡ Buy on Day 0, Sell on Day 3
➡ Buy on Day 4, Sell on Day 6

### ❌ Case 2: No Profit Possible

```
Enter size: 
4
100 90 80 70
No Profit
```

---

## 💻 How to Run

### **Step 1: Change Directory**

```bash
cd src/main/java/stockBuyAndSellPartOne
```

### **Step 2: Compile the Program**

```bash
javac StockBuyAndSellPartOne.java
```

### **Step 3: Run the Program**

```bash
java StockBuyAndSellPartOne.java
```

---
