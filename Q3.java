// Write a Java program to convert a decimal number to binary numbers.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();   

        int integerPart = (int) decimal;   
        String binary = Integer.toBinaryString(integerPart);

        System.out.println("Binary of integer part: " + binary);

        sc.close();
    }
}

