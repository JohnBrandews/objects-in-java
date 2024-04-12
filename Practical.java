//updating in java
// public class Practical {
// public static void main(String[] args) {
//     int[] numbers = {1, 2, 3, 4};

//     numbers[2] = 5;
    
//     for(int i = 0; i<numbers.length; i++) {
//         System.out.println(numbers[i] + " ");
//     }
// }
// }
//deleting in java
public class Practical {
    public static void main(String[] args) {
        int[] numbers = {23,24,25,26,27,28,29,30,31};
        int indexdelete = 2;
        for (int i = indexdelete; i < numbers.length-1; i++) {
            numbers[i] = numbers[i+1];

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " " );
        }
    }
}
