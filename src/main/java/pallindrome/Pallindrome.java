package pallindrome;

import java.util.Scanner;

public class Pallindrome {
		public String isPallindrome(int num){
		    if (num < 0) {
		        return "Invalid input"; 
		    }

			int rev=0,temp=0;
			int num1=num;
			while(num>0){
				temp=num%10;
				rev=rev*10+temp;
				num=num/10;	
			}
			if(num1==rev)
				return "Yes";
			else
				return "No";
		}
		public static void main(String[] args) {
			Pallindrome p= new Pallindrome();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			if(sc.hasNextInt())
			{
				int num=sc.nextInt();
				System.out.println(p.isPallindrome(num));
			}
			else
			{
				System.out.println("Invalid Input...");
			}
			
			sc.close();
			
			
		}
}
