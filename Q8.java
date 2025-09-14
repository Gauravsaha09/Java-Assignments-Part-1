// Write a Java program to print the even and odd numbers from 1 to 20 by using a call to two different methods belonging to the same superclass.

public class Q8 {
    public static void main(String[] args) {
        
        System.out.println("Even number from 1 to 20");
          for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }
        {
            System.out.println();
        }
                
        System.out.println("Odd number from 1 to 20");
          for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i +" ");
            }
        }
    
    }
}
