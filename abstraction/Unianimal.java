package abstraction;
//abstraction
abstract class Unianimal {
    public abstract void makeSound();
    public void sleep (){
        System.out.println("the animal is sleeping");
    }
}
class Dog extends Unianimal {
    public void makeSound() {
        System.out.println("the dog barks");
    }
}
 public static void main(String[] args) {
    Unianimal dog = new Dog();
    dog.makeSound();
    dog.sleep();
 }
