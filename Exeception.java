public class Exeception {
   public static  void main(String[] args) {
    int numerator = 10;
    int denominator = 0;
    try{
        int result = divide(numerator, denominator);
        System.out.println("result: " + result);
    }catch(ArithmeticException e){
        System.err.println("error" + e.getMessage());

    }
   } 
   private static int divide(int numerator, int denominator){
    return numerator /denominator;
   }
}
