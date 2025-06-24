# Check Prime Number

This Java program checks whether a given integer is a **prime number** or not.

# What is a Prime Number?

A **prime number** is a number greater than 1 that is divisible only by 1 and itself.

**Examples:**  
- 2, 3, 5, 7 are prime numbers  
- 1, 4, 6, 8 are not prime numbers

## 📂 Package Structure

Assignment2  
└── prime  
    └── PrimeNo.java

## 🚀 How It Works

1. The user is prompted to enter a number.
2. If the input number is less than or equal to 1:
   - Returns `0` (Not prime).
3. The program checks divisibility from 2 to `num / 2`:
   - If divisible, it's not a prime (returns `0`).
   - Otherwise, it's a prime (returns `1`).
4. If input is not a valid number:
   - It displays `"Invalid Number"`.

## 🧾 Sample Input/Output

Enter the number: 7  
1

Enter the number: 4  
0

Enter the number: -2  
0

Enter the number: hello  
Invalid Number

## 💻 How to Run

**Compile the program:**

javac PrimeNo.java

**Run the program:**

java prime.PrimeNo