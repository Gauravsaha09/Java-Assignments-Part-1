// Write a Java program to compute the sum of the first 100 prime numbers.

public class Q9 {
    public static void main(String[] args) {
         int count = 0, num = 2, sum = 0;

        while (count < 100) {
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of first 100 prime numbers = " + sum);
    
    }
}
