public class ShiftOperator {
    public static void main(String[] args) {

        int number = 8;

        int leftShift = number << 2;
        int rightShift = number >> 2;

        System.out.println("Original number = " + number);
        System.out.println("After left shift = " + leftShift);
        System.out.println("After right shift = " + rightShift);
    }
}