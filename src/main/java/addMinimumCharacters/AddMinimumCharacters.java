package addMinimumCharacters;

import java.util.Scanner;

public class AddMinimumCharacters {
	public static int addMinChar(String str) {
		int n = str.length();

        for (int i = 0; i < n; i++) {
            if (isPalindrome(str.substring(i))) {
                return i;
            }
        }

        return n - 1;
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
