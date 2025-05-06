package Lecture3;

public class jumpandcontinue {
    public static void main(String[] args) {
        // Example 1: continue statement
        System.out.println("Continue Example - Skip even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // If number is even
                continue; // Skip the rest of the loop body
            }
            System.out.println("Processing: " + i);
        }

        // Example 2: break statement
        System.out.println("\nBreak Example - Stop loop when reaching 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            if (i == 5) {
                System.out.println("Found 5! Breaking the loop.");
                break; // Exit the loop
            }
        }

        // Example 3: labeled break/continue
        System.out.println("\nLabeled Break Example:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop");
                    break outerLoop; // Exit both loops
                }
            }
        }
    }
}
