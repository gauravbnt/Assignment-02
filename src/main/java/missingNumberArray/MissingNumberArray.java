package missingNumberArray;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberArray {
	public static int missingNumber(int arr[],int n) {
		
	    if (arr == null) {
	        throw new NullPointerException("Input array is null.");
	    }

	    if (arr.length != n - 1) {
	        throw new IllegalArgumentException("Array must contain exactly n-1 elements.");
	    }

	    int expectedSum = n * (n + 1) / 2;
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return expectedSum - sum;
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
