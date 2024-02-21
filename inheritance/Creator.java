package inheritance;
//multilevel inheritance
public class Creator {
    void eat(){
        System.out.println("animal is eating");
    }
}
class Mamoth extends Creator {
void run(){
    System.out.println("animal is runnig");
}
}
class Dog extends Mamoth{
    void bark(){
        System.out.println("the animal is barking");
    }
}
public static void main(String[] args){
    Dog dog = new Dog();
    dog.eat();
    dog.run();
    dog.bark();
}
