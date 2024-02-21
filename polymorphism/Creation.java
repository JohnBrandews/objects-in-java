package polymorphism;
//polymorphism
public class Creation {
    void makeSound (){
        System.out.println("General animal soun");
    }
}
class Dog extends Creation {
@Override
void makeSound () {
    System.out.println("bark");
}
}
class Cat extends Creation {
    @Override
    void makeSound () {
    System.out.println("meow");
    }
}
public static void main (String[] args){
    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.makeSound();
    cat.makeSound();
}