package assignment;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        int DAILY_LIMIT = 50000;
        int daily_total = 0;

        try {
            while (true) {
                System.out.print("Enter new transaction amount: ");
                int newTransaction = s1.nextInt();

                if (daily_total + newTransaction > DAILY_LIMIT) {
                    throw new TransactionLimitCheck(
                        "Transaction failed! Daily limit of ₹50,000 exceeded."
                    );
                }

                daily_total += newTransaction;

                System.out.println("Transaction successful");
                System.out.println("Today's total transactions: ₹" + daily_total);
            }
        }
        catch (TransactionLimitCheck ob) {
            System.out.println(ob.getMessage());
        }

       
    }
}

// Custom Exception
class TransactionLimitCheck extends RuntimeException {
    public TransactionLimitCheck(String msg) {
        super(msg);
    }
}
