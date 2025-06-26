package anagramString;

import java.util.Scanner;

public class AnagramString {
	public static int remAnagram(String S1, String S2) {
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (char c : S1.toCharArray()) {
            freq1[c]++;
        }

        for (char c : S2.toCharArray()) {
            freq2[c]++;
        }

        int deletions = 0;

        for (int i = 0; i < 256; i++) {
            deletions= deletions+ Math.abs(freq1[i] - freq2[i]);
        }

        return deletions;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first string : ");
    	String str1=sc.nextLine();
    	
    	System.out.println("Enter second string : ");
    	String str2=sc.nextLine();
    	System.out.println(remAnagram(str1, str2));
    	sc.close();
    			
        
    }

}
