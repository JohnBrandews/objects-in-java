import java.util.*;

public class marks {
    public static void main(String[] args) {
        int [] marks = new int[10];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.nextLine();
        System.out.println("enter your marks");
        int i = input.nextInt();
        for ( i = 0; i < marks.length; i++) {
            int mark = input.nextInt();
            if(mark > 100){
                System.out.println("invalid marks please enter a valid mark!");

            }
            else{
                marks[i] = mark;
                sum += marks[i];
                System.out.println("the  total marks is " + sum);
            }
        }

        
        
    }
}
