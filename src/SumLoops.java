import java.util.Scanner;

public class SumLoops {
    public static void main (String[] args){

        //Create a Java program that calculates the sum of all numbers from 1 to n,
        // where n is provided by the user.
        // Use both a for loop and a while loop to compute the sum.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // Using a for loop
       int sumFor = 0;
         for( int i = 1; i <= n; i++){
            sumFor = sumFor + i;
         }
        System.out.println("Sum using for loop: " + sumFor);

        // Using while loop

        int sumWhile = 0, j = 1;
        while ( j <= n){
            sumWhile = sumWhile + 1;
            j++;
        }
        System.out.println ("Sum using while loop: " + sumWhile);

        scanner.close();
    }
}
