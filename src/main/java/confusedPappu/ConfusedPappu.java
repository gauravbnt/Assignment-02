package confusedPappu;

import java.util.Scanner;

public class ConfusedPappu {

    public int extraAmount(int amount) {
        int convAmount = revAmount(amount);
        int extra= convAmount - amount;
        return extra;
    }

    public int revAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amounts are not allowed.");
        }

        int conv = 0;
        int mul = 1;
        while (amount > 0) {
            int digit = amount % 10;
            if (digit == 6)
                digit = 9;
            conv = conv + digit * mul;
            mul *= 10;
            amount = amount / 10;
        }
        return conv;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
 
        int amount = sc.nextInt();
        
        ConfusedPappu cp = new ConfusedPappu();
        int extra = cp.extraAmount(amount);
        System.out.println("" + extra);

        sc.close();
    }
}
