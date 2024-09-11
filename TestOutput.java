public class TestOutput {
    public static void main(String[] args) {
        System.out.println("This is a test output");
        System.err.println("This is an error output");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Line " + i);
        }
    }
}