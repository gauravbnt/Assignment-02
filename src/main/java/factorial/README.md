# Check Factorial of a number

This Java program calculates the **factorial** of a given non-negative integer.
	
#  What is a Factorial?

A **factorial** of a non-negative integer `n` is the product of all positive integers less than or equal to `n`.

**Mathematically:**  
	n! = n × (n - 1) × (n - 2) × ... × 2 × 1
	

## 📂 Package Structure

Assignment2	
└── factorial
└── Factorial.java


## 🚀 How It Works

1. The user is prompted to enter an integer.
2. If the input is valid and non-negative:
   - The program calculates the factorial using a `while` loop.
3. If the number is negative:
   - A warning is shown: `"Number should not be negative..."`
4. If input is not an integer:
   - A message is displayed: `"Invalid Number..."`

   
## 🧾 Sample Input/Output

Enter the number: 5
120

Enter the number: -3
Number should not be negative...

Enter the number: abc
Invalid Number...



## 💻 How to Run

 **Compile the program:**

javac Factorial.java

 **Run the program:**

java factorial.Factorial
   