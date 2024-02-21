package inheritance;
//single inheritance
public class Vehicle {
   String brand;
   public Vehicle(String brand) {
    this.brand = brand;
   }
public void drive () {
    System.out.println("the vehicle is moving");
   } 
}
class Car extends Vehicle {
    int numberOfSeats;
    public Car (int numberOfSeats, String brand) {
        super(brand);
        this.numberOfSeats = numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
}
public void displayinfo() {
    System.out.println("brand"+ brand);
    System.out.println("numberOfSeats"+ numberOfSeats);
}
public static void main(String[] args) {
    Car car = new Car(4,"toyota");
    System.out.println("brand" + car.brand);
    car.drive();
    car.setNumberOfSeats(5);
    car.displayinfo();
}
}
