// *
// **
// ***
// ****
// ***
// **
// *
package Lecture3;

public class pattern4 {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}