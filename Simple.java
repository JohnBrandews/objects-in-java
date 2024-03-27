public class Simple {
    private int num1;
    private int num2;

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divide() {
        try {
            System.out.println("Result: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Simple simpleObject = new Simple(10, 0);
        simpleObject.divide();
    }
}
