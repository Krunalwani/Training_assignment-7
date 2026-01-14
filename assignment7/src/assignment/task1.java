package assignment;

import java.util.Scanner;

public class task1 {

    

    public static void main(String[] args) {
    	
    

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        int Min_Bal=1000;

        try {
        	if (balance< withdraw) {
        		 throw new MinBalanceException("Withdrawal amount is greater than available balance. ");
        	}
        	else if (balance - withdraw < Min_Bal) {
                throw new MinBalanceException("Withdrawal denied! Minimum balance of ₹1000 must be maintained.");
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: ₹" + balance);
        } 
        catch (MinBalanceException ob) {
            System.out.println(ob.getMessage());
        }

        sc.close();
    }
}

// Custom Exception
class MinBalanceException extends RuntimeException {
    public MinBalanceException(String msg) {
        super(msg);
    }
}
