package kthSmallestElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestElement {

    public static int kthSmallest(int[] array, int n, int k) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            treeSet.add(num); 
        }

        List<Integer> set = new ArrayList<>(treeSet);

        if (k <= 0 || k > set.size()) {
            throw new IllegalArgumentException("Invalid value of k: " + k);
        }

        return set.get(k - 1); 
    }

    public static void main(String[] args) {
        int n = 0, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid size. Size must be positive.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid number entered.");
                sc.close();
                return;
            }
        }

        System.out.println("Enter the value of k:");
        if (sc.hasNextInt()) {
            k = sc.nextInt();
            if(k<=0)
            {
            	System.out.println("Invalid value for k..");
            	return;

            }
            int result = kthSmallest(arr, n, k);
            System.out.println("K-th smallest distinct element: " + result);
            }
        else {
            System.out.println("Invalid input for k.");
            return;
        }

        sc.close();
    }
}
