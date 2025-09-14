// Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;  // Get last digit
            sum += digit;          // Add to sum
            num /= 10;             // Remove last digit
        }

        // Output
        System.out.println("Sum of digits of " + originalNum + " = " + sum);

        sc.close();
    }
}
