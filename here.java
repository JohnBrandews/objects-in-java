public class here {
    String model;
    String color;

    void start() {
        System.out.println("The car is starting");
    }

    void drive() {
        System.out.println("I'm driving the car");
    }

    public static void main(String[] args) {
        here car = new here();
        car.model = "Range Rover";
        car.color = "black";
        car.start();
        car.drive();
    }
}