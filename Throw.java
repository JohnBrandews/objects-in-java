public class Throw {
    public static void main(String[] args) {
        try{
            validateAge(15);
        }catch(IllegalArgumentException e){
            System.err.println("error: " + e.getMessage());
        }
    }
    private static void validateAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("age must be 18 or older");
        }
        System.out.println("age is valid");
    }
}
