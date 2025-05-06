package Lecture2;

public class Numbers {
    public static void main(String[] args) {
        int evenSum = 0;
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + (i < 100 ? ", " : "\n"));
            evenSum += i;
        }
        System.out.println("Sum of even numbers: " + evenSum);

        int oddSum = 0;
        System.out.println("\nOdd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + (i < 99 ? ", " : "\n"));
            oddSum += i;
        }
        System.out.println("Sum of odd numbers: " + oddSum);

        int totalSum = 0;
        System.out.println("\nAll numbers from 1 to 100:");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + (i < 100 ? ", " : "\n"));
            totalSum += i;
        }
        System.out.println("Sum of all numbers: " + totalSum);

        // Added while loop demonstration
        System.out.println("\n--- While Loop Demonstration ---");
        int whileSum = 0;
        int j = 1;
        System.out.println("Numbers from 1 to 100 using while loop:");
        while (j <= 100) {
            System.out.print(j + (j < 100 ? ", " : "\n"));
            whileSum += j;
            j++;
        }
        System.out.println("Sum using while loop: " + whileSum);

        System.out.println("\n--- Pre and Post Increment/Decrement Demonstration ---");
        int a = 5;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        System.out.println("Post-increment (a++): " + a++);
        System.out.println("After post-increment: a = " + a);

        System.out.println("Pre-increment (++b): " + ++b);
        System.out.println("After pre-increment: b = " + b);

        System.out.println("Post-decrement (a--): " + a--);
        System.out.println("After post-decrement: a = " + a);

        System.out.println("Pre-decrement (--b): " + --b);
        System.out.println("After pre-decrement: b = " + b);

        int c = 10;
        int d = c++ + ++c - ++c + c++;
        System.out.println("c = " + c + ", d = " + d);
    }
}
