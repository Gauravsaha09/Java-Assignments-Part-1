// Write a Java program that takes five numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Five Numbers:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int sum = n1 + n2 + n3 + n4 + n5;
        double average = sum/5.0;

        
        System.out.println("Average"+ average);

        sc.close();
    }
}

