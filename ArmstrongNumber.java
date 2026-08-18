import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a 3 digit number: ");
            int number = input.nextInt();

            int original = number;
            int sum = 0;

            while (number > 0) {

                int digit = number % 10;

                sum = sum + digit * digit * digit;

                number = number / 10;
            }

            if (sum == original) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not Armstrong Number");
            }

            System.out.print("Do you want to check again? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}