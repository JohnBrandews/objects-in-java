import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        //insertion
        numbers.add(1,5);
    
        
        //tranversing and printing the linked list using listiterator
        System.out.println("original linked list" + numbers);
        ListIterator<Integer> iterator = numbers.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //deletion:removing by value
        numbers.remove(Integer.valueOf(20));
        //deletion:removing an element at a specific position
        numbers.remove(2);
        //tranversing and printing the modified list
        System.out.println("linkedlist after modification");
        iterator = numbers.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
