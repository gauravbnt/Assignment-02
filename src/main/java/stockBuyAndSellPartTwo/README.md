---

# 📈 Stock Buy and Sell - Part Two

This Java program calculates the **maximum profit** you can achieve by performing **as many buy and sell transactions** as you like, given an array of stock prices over `n` days.

---

## ❓ Problem Description

You're given an array `prices[]` where `prices[i]` represents the price of a stock on day `i`. You can complete **multiple transactions** (i.e., buy one and sell one share of the stock multiple times).

> **Note:** You cannot engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

---

## 📂 Package Structure

```
Assignment2  
└── stockBuyAndSellPartTwo  
    └── StockBuyAndSellPartTwo.java
```

---

## 🚀 How It Works

1. The user enters the number of days and their respective stock prices.
2. The algorithm iterates through the array:

   * Whenever `prices[i] > prices[i-1]`, it **adds the profit** `prices[i] - prices[i-1]`.
3. Returns the **total maximum profit** from all upward price trends.

---

## 🧾 Sample Input/Output

### ✅ Example 1

```
Enter size: 
6
Enter the values : 
7 1 5 3 6 4
Maximum Profit: 7
```

> Explanation:
> Buy on day 2 (price = 1), sell on day 3 (price = 5) → profit = 4
> Buy on day 4 (price = 3), sell on day 5 (price = 6) → profit = 3
> **Total profit = 4 + 3 = 7**

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
cd src/main/java/stockBuyAndSellPartTwo
```

### **Step 2: Compile the Program**

```bash
javac StockBuyAndSellPartTwo.java
```

### **Step 3: Run the Program**

```bash
java StockBuyAndSellPartTwo.java
```

---
