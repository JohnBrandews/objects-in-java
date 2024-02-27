public class ThrowExample {
    public static void main(String[] args) {
        try{
            validateNumber(5);
            validateNumber(-3);
        }catch(IllegalArgumentException e){
            System.err.println("error: " + e.getMessage());
        }

        }
        private static void validateNumber(int number) throws IllegalArgumentException{
            if (number < 0) {
                throw new IllegalArgumentException("number must be non-negative");
            }
            System.out.println("number is valid: " + number);
        }
    }

