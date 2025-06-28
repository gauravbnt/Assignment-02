package missingNumberArray;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberArray {
	public static int missingNumber(int arr[],int n) {
		int expectedSum=n*(n+1)/2;
		int temp=0;
		int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			sum+=arr[i];
		}
		temp=expectedSum-sum;
		return temp;
	}

	public static void main(String[] args) {
		int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid size. Size must be positive.");
                return;        
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for size.");
            return;
        }      

        int[] arr = new int[n-1];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n-1; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid number entered..");
                return;
            }
        }
        System.out.println(missingNumber(arr,n));
	}
}
