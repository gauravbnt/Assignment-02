package thirdLargestElement;

import java.util.*;

public class ThirdLargestElement {

    public static int thirdLargest(int[] a) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : a) {
            set.add(num);
        }

        if (set.size() < 3) {
            return -1;
        }

        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size() - 3);
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

        int result = thirdLargest(arr);
        System.out.println(result);
        sc.close();
        
    }
}
