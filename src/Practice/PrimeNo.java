package Practice;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true; // Assume the number is prime

        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            for (int i = 2; i <= n / 2; i++) { // Loop from 2 to n/2
                if (n % i == 0) { // If divisible by i
                    isPrime = false;
                    break; // No need to check further
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}