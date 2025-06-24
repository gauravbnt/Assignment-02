# Check Nth Fibonacci Number

This Java program calculates the **Nth Fibonacci number** using iteration and returns the result modulo 1000000007.

# What is a Fibonacci Number?

A **Fibonacci** number is a number in a sequence where each number is the sum of the two preceding ones.

**Mathematically:**  
F(0) = 0  
F(1) = 1  
F(n) = F(n - 1) + F(n - 2)

## 📂 Package Structure

Assignment2  
└── fibbonacciNumber  
    └── FibbonacciNumber.java

## 🚀 How It Works

1. The user is prompted to enter an integer.
2. The program calculates the Nth Fibonacci number using a loop.
3. The result is taken modulo 1000000007 to avoid overflow.

## 🧾 Sample Input/Output

Enter the nth number: 7  
13

Enter the nth number: 0  
0

Enter the nth number: 1  
1

## 💻 How to Run

**Compile the program:**

javac FibbonacciNumber.java

 **Run the program:**

java fibbonacciNumber.FibbonacciNumber
