// Write a Java program to swap the first and last elements of an array.


public class Q10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before swap:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        // Swap first and last
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println("\nAfter swap:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
