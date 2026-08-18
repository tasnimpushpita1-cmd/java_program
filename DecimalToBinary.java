import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;

            binary = binary + remainder * place;

            decimal = decimal / 2;
            place = place * 10;
        }

        System.out.println("Binary = " + binary);
    }
}
