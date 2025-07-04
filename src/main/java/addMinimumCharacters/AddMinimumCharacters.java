package addMinimumCharacters;

import java.util.Scanner;

public class AddMinimumCharacters {
	public static int addMinChar(String str) {
		if (str == null || str.isEmpty()) {
		    throw new NullPointerException("Input string must not be null or empty");
		}

		int n = str.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
        	String substring = str.substring(0, i+1);
            if (isPalindrome(substring) && max < substring.length()) {
                max = substring.length();
            }
        }
        return str.length() - max;
	}
	public static boolean isPalindrome(String str1) {
		int left = 0, right = str1.length() - 1;
        while (left < right) {
            if (str1.charAt(left++) != str1.charAt(right--)) {
                return false;
            }
        }
        return true;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		System.out.println(addMinChar(str));		
	}

}

