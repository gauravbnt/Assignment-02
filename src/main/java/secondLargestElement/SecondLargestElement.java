package secondLargestElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SecondLargestElement {
	 public static int secondLargest(int[] a) {
	        TreeSet<Integer> set = new TreeSet<>();
	        for (int num : a) {
	            set.add(num);
	        }

	        if (set.size() < 2) {
	            return -1;
	        }

	        List<Integer> list = new ArrayList<>(set);
	        return list.get(list.size() - 2);
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

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            if (sc.hasNextInt()) {
	                arr[i] = sc.nextInt();
	            } else {
	                System.out.println("Invalid number entered..");
	                return;
	            }
	        }

	        int result = secondLargest(arr);
	        System.out.println(result);
	        sc.close();
	        
	}

}
