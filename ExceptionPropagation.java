public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.err.println("caught in main" + e.getMessage());
        }
        }
        private static void method1(){
            method2();
        }
        private static void method2(){
            method3();
        }
        private static void method3(){
            int result = 10/0;
        }
    }

