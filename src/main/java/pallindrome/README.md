# Check Palindrome Number

This Java program checks whether a given integer number is a **Palindrome** or not.

# What is a Palindrome Number?

A **Palindrome** number is a number that remains the same when its digits are reversed.

**Examples:**  
121 → Palindrome  
123 → Not a Palindrome

## 📂 Package Structure

Assignment2  
└── pallindrome  
    └── Pallindrome.java

## 🚀 How It Works

1. The user is prompted to enter an integer.
2. If the number is negative:
   - The program prints `"Invalid input"`.
3. If the number is non-negative:
   - The program reverses the digits.
   - It checks if the reversed number equals the original.
   - If yes, it returns `"Yes"`; otherwise, `"No"`.
4. If the input is not an integer:
   - The program prints `"Invalid Input..."`.

## 🧾 Sample Input/Output

Enter the number: 121  
Yes

Enter the number: 123  
No

Enter the number: -121  
Invalid input

Enter the number: abc  
Invalid Input...

## 💻 How to Run

**Compile the program:**

javac Pallindrome.java

**Run the program:**

java pallindrome.Pallindrome
