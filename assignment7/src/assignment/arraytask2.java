package assignment;

import java.util.Scanner;

public class arraytask2 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        int arr[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s1.nextInt();
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even Number Count: " + count);
        
    }
}
