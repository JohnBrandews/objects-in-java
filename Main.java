import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();
        // Add key-value pairs (Name, Age)
        people.put("Alice", 30);
        people.put("Bob", 25);
        // Retrieve values
        int aliceAge = people.get("Alice");
        System.out.println("Alice's age: " + aliceAge); // Output: Alice's age: 30
    }
}
