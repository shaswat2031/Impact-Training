package Lecture2;

// Print even numbers 1-100, their sum, and demonstrate pre/post increment/decrement
public class Numbers {
    public static void main(String[] args) {
        // Print even numbers from 1 to 100 and calculate their sum
        int evenSum = 0;
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + (i < 100 ? ", " : "\n"));
            evenSum += i;
        }
        System.out.println("Sum of even numbers: " + evenSum);

        // Print odd numbers from 1 to 100 and calculate their sum
        int oddSum = 0;
        System.out.println("\nOdd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + (i < 99 ? ", " : "\n"));
            oddSum += i;
        }
        System.out.println("Sum of odd numbers: " + oddSum);

        // Print all numbers from 1 to 100 and calculate their sum
        int totalSum = 0;
        System.out.println("\nAll numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + (i < 100 ? ", " : "\n"));
            totalSum += i;
        }
        System.out.println("Sum of all numbers: " + totalSum);

        // Demonstrating pre and post increment/decrement
        System.out.println("\n--- Pre and Post Increment/Decrement Demonstration ---");
        int a = 5;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Post-increment: Use the value first, then increment
        System.out.println("Post-increment (a++): " + a++);
        System.out.println("After post-increment: a = " + a);

        // Pre-increment: Increment first, then use the value
        System.out.println("Pre-increment (++b): " + ++b);
        System.out.println("After pre-increment: b = " + b);

        // Post-decrement: Use the value first, then decrement
        System.out.println("Post-decrement (a--): " + a--);
        System.out.println("After post-decrement: a = " + a);

        // Pre-decrement: Decrement first, then use the value
        System.out.println("Pre-decrement (--b): " + --b);
        System.out.println("After pre-decrement: b = " + b);

        int c = 10;
        int d = c++ + ++c - ++c + c++;
        System.out.println("c = " + c + ", d = " + d); // c = 8, d = 20
    }
}