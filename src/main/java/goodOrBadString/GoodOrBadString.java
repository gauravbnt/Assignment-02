package goodOrBadString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodOrBadString {
	public static int isGoodorBad(String str1)
	{
		if(str1.length() == 0){
			System.out.println("Invalid input");
			return 0;
		}
		str1 = str1.toLowerCase();
		List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		
		for(int i=0;i<str1.length()-1;i++){
			if(vowels.contains(str1.charAt(i))) {
				
				int count = 1;
				for(int j=i+1;j<str1.length();j++){
					if(vowels.contains(str1.charAt(j)) || str1.charAt(j) == '?'){
						count++;
					}
					else
						break;
				}
				if(count > 5)
					return 0;
			}
			
			if(!vowels.contains(str1.charAt(i))) {
				int count = 1;
				for(int j=i+1;j<str1.length();j++)
				{
					if(!vowels.contains(str1.charAt(j)) || str1.charAt(j) == '?')
					{
						count++;
					}
					else
						break;
				}
				if(count > 3)
					return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.nextLine();
		System.out.println(isGoodorBad(str1));
		sc.close();
	}

}
