package Lecture1;

public class Nestedif {
    public static void main(String[] args) {
        int totalPurchase = 1500;
        boolean isMember = true;
        boolean isWeekend = false;

        if (totalPurchase >= 1000) {
            if (isMember) {
                System.out.println("You get 20% discount as a member with purchase over 1000!");
                double finalPrice = totalPurchase * 0.8;
                System.out.println("Final price: " + finalPrice);
            } else {
                System.out.println("You get 10% discount on purchase over 1000!");
                double finalPrice = totalPurchase * 0.9;
                System.out.println("Final price: " + finalPrice);
            }
        } else {
            if (isWeekend) {
                System.out.println("Weekend special: 5% off on all purchases!");
                double finalPrice = totalPurchase * 0.95;
                System.out.println("Final price: " + finalPrice);
            } else {
                System.out.println("No discount applicable");
                System.out.println("Final price: " + totalPurchase);
            }
        }
    }
}
