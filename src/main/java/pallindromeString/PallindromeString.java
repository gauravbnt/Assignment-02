package pallindromeString;

import java.util.Scanner;

public class PallindromeString {
	public int pallindrome(String str) {
		if(str==null)
			return 0;
		str=str.toLowerCase();
		int left=0,right=str.length()-1;
		while(left<right){
			if(str.charAt(left)!=str.charAt(right))
				return 0;
			left++;
			right--;	
		}
		return 1;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		PallindromeString p=new PallindromeString();
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		System.out.println(p.pallindrome(str));
		sc.close();
	}
}
