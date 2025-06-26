package checkForSubsequence;

import java.util.Scanner;

public class CheckForSubsequence {
	
	public static int isSubSequence(String s1,String s2) {
		int temp=0;
		for(int i=0;i<s1.length();i++)
		{
			boolean flag=false;
			for(int j=temp;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					flag=true;
					temp=j+1;
					break;
				}
				
			}
			if(!flag) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1=sc.nextLine();
		
		System.out.println("Enter the second string : ");
		String str2=sc.nextLine();
		if(str1.isEmpty() && str2.isEmpty())
		{
			System.out.println("Invalid Input...");
			return;
		}
		System.out.println(isSubSequence(str1, str2));
		sc.close();
			
	}

}
