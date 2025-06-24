# Check Palindrome String

This Java program checks whether a given **String** is a **Palindrome** or not.

# What is a Palindrome String?

A **Palindrome** string is a word or phrase that reads the same forwards and backwards (ignoring case).

**Examples:**  
- "madam" → Palindrome  
- "racecar" → Palindrome  
- "hello" → Not a Palindrome

## 📂 Package Structure

Assignment2  
└── pallindromeString  
    └── PallindromeString.java

## 🚀 How It Works

1. The user is prompted to enter a string.
2. The string is converted to lowercase for case-insensitive comparison.
3. Characters from the start and end are compared moving inward:
   - If all corresponding characters match, the string is a palindrome.
   - Otherwise, it is not.
4. If input is `null`, it is considered invalid.

## 🧾 Sample Input/Output

Enter the string: madam  
1

Enter the string: hello  
0

Enter the string: RaceCar  
1

## 💻 How to Run

**Compile the program:**


javac PallindromeString.java

**Run the program**

java pallindromeString.PallindromeString

