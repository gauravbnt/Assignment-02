package immediateSmallerElement;

import java.util.Scanner;

public class ImmediateSmallerElement {
    public static int[] immediateSmaller(int[] arr, int n) {
        if (arr == null || n == 0) return new int[0];

        int[] result = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result[i] = arr[i + 1];
            } else {
                result[i] = -1;
            }
        }

        result[n - 1] = -1;
        return result;
    }

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		if (n <= 0) {
	         System.out.println(" Invalid input...");
	         return;
	     }
		int arr[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int a[]=immediateSmaller(arr, n);
		for(int x:a) {
			System.out.println(x);
		}
		
	}

}
