package factorial;

import java.util.Scanner;

public class Factorial {
	
	public long factorial(int num) {
        if (num < 0) {
            return -1;  
        }
        long fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();

        System.out.print("Enter the number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            long result = f.factorial(num);

            if (result == -1) {
                System.out.println("Number should not be negative...");
            } else {
                System.out.println("" + result);
            }

        } else {
            System.out.println("Invalid Number...");
        }

        sc.close();
    }
}
