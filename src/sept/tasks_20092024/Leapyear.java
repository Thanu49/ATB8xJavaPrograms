package sept.tasks_20092024;

public class Leapyear {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("leap year");
            } else if (year % 100 != 0) {
                System.out.println("leap year");
            } else {
                System.out.println("Not a leap year");

            }
        } else {
            System.out.println("Not a leap year");

        }
    }
}

