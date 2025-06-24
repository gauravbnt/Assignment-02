# Print Fibonacci Series

This Java program prints the **Fibonacci series** up to the Nth term using iteration.

# What is a Fibonacci Series?

A **Fibonacci series** is a sequence where each number is the sum of the two preceding ones.  
The series starts with 1, 1 by default in this program.

**Mathematically:**  
F(1) = 1  
F(2) = 1  
F(n) = F(n - 1) + F(n - 2)

## 📂 Package Structure

Assignment2  
└── fibbonacciSeries  
    └── FibbonacciSeries.java

## 🚀 How It Works

1. The user is prompted to enter an integer `n`.
2. The program calculates the first `n` Fibonacci numbers using a loop.
3. The sequence is printed up to the Nth term.
4. If `n <= 0`, an empty sequence is returned.

## 🧾 Sample Input/Output

Enter the nth number: 5  
1 1 2 3 5  

Enter the nth number: 1  
1  

Enter the nth number: 0  
(no output)

## 💻 How to Run

 **Compile the program:**

javac FibbonacciSeries.java

 **Run the program:**

java fibbonacciSeries.FibbonacciSeries
