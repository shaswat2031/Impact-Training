package Lecture1;

public class Switchstatemet {

    public static void main(String[] args) {
        // Example 1: Traditional switch case with day of week
        System.out.println("Example 1: Traditional switch statement");

        int dayOfWeek = 3; // Wednesday
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + dayOfWeek + " is " + dayName);

        // Example 2: Switch with fall-through (intentionally omitting breaks)
        System.out.println("\nExample 2: Fall-through example");

        int month = 8; // August
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
                break;
        }

        System.out.println("Month " + month + " is in " + season);

        // Example 3: Switch expression (Java 12+)
        System.out.println("\nExample 3: Switch expression (Java 12+)");

        int grade = 90;
        char letterGrade = switch (grade / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println("Score " + grade + " gets a grade of " + letterGrade);
    }
}
