package mergeTwoStrings;

//import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoStrings {
	public static String merge(String s1,String s2) {
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		int n=a.length+b.length;
		char c[]=new char[n];
		int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
        
        String mergedString=new String(c);
		
		return mergedString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string : ");
		String str1=sc.nextLine();

		System.out.println("Enter the second string : ");
		String str2=sc.nextLine();		
		
		System.out.println(merge(str1,str2));
		sc.close();

	}

}
