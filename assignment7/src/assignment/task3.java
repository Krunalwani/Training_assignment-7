package assignment;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        // Sign Up
        System.out.println("Sign Up");
        System.out.print("Enter Your Username: ");
        String username = s1.nextLine();

        System.out.print("Enter Your Password: ");
        String password = s1.nextLine();

        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            try {
                System.out.println("\nSign In Attempt " + i);

                System.out.print("Enter Your Username: ");
                String username1 = s1.nextLine();

                System.out.print("Enter Your Password: ");
                String password1 = s1.nextLine();

                if (!username.equals(username1)) {
                    throw new LogCheck("Invalid Username");
                } 
                else if (!password.equals(password1)) {
                    throw new LogCheck("Invalid Password");
                }

                System.out.println("You are SIGNED IN SUCCESSFULLY");
                break; // stop after success
            } 
            catch (LogCheck ob) {
                System.out.println(ob.getMessage());

                if (i == attempts) {
                    System.out.println("Account Locked");
                }
            }
        }
    }
}

// Custom Exception
class LogCheck extends RuntimeException {
    public LogCheck(String msg) {
        super(msg);
    }
}
