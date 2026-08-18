public class VariableExample {

    // Instance variable
    int number = 100;

    void display() {

        // Local variable
        int number = 50;

        System.out.println("Local variable = " + number);
        System.out.println("Instance variable = " + this.number);
    }

    public static void main(String[] args) {

        VariableExample obj = new VariableExample();

        obj.display();
    }
}