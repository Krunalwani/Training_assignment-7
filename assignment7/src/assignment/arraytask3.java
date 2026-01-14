package assignment;

import java.util.Scanner;

public class arraytask3 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        int salary[] = new int[n];
        for (int i = 0; i < n; i++) salary[i] = s1.nextInt();

        int maxsal = salary[0];
        for (int i = 1; i < n; i++) {
            if (salary[i] > maxsal) {
                maxsal = salary[i];
            }
        }

        System.out.println("Highest Salary: " + maxsal);
        
    }
}

