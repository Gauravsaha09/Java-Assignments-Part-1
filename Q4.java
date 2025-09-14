// Program: Convert any number (entered as decimal) into decimal and binary forms

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();   // take any number (89898, 22, 3444, etc.)

        // Decimal is the number itself
        System.out.println("Decimal: " + number);

        // Binary representation of that number
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary: " + binary);

        sc.close();
    }
}
