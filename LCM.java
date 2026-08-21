import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = Math.max(a, b);

        while (lcm % a != 0 || lcm % b != 0)
            lcm++;

        System.out.println("Least Common Multiple (LCM) = " + lcm);
    }
}