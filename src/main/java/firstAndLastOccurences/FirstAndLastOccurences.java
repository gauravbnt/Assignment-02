package firstAndLastOccurences;

import java.util.Scanner;

public class FirstAndLastOccurences {

    public static int[] firstAndLast(int arr[], int value) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if (first == -1)
                    first = i;

                last = i;
            }
        }
        return first == -1 ? new int[]{-1} : new int[]{first, last};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid size.");
                sc.close();
                return;
            }

            int[] arr = new int[n]; 

            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }

            System.out.println("Enter the number to find: ");
            int x = sc.nextInt();

            int[] result = firstAndLast(arr, x);

            if (result.length == 2)
                System.out.println("First index: " + result[0] + "\nLast index: " + result[1]);
            else
                System.out.println(result[0]);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}
