import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password;
        String confirmPassword;

        // Create password
        System.out.print("Create your password: ");
        password = input.nextLine();

        // Check password
        do {
            System.out.print("Enter your password to login: ");
            confirmPassword = input.nextLine();

            if (!confirmPassword.equals(password)) {
                System.out.println("Wrong password. Try again.");
            }

        } while (!confirmPassword.equals(password));

        System.out.println("Password correct. Access granted.");
    }
}