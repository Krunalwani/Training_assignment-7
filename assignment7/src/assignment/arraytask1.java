package assignment;

import java.util.Scanner;

public class arraytask1 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Number Of Subject");
        int n = s1.nextInt();

        int marks[] = new int[n];
        int total = 0;

        
        for (int i = 0; i < n; i++) {
            marks[i] = s1.nextInt();
            total += marks[i];
        }

        
        System.out.println("Total Marks: " + total);

       
    }
}

