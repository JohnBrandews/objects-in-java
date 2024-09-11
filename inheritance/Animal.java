  package inheritance;
  //hierarchical inheritance
  class Animal {
    public void eat(){
        System.out.println("the animal is eating");
    }
  }
class Mammal extends Animal {
    public void giveBirth(){
        System.out.println("the animal is giving birth");
}
}
class Bird extends Animal{
public void fly(){
    System.out.println("the bird is flying");
}
}

public static void main(String[] args) {
    Mammal mammal = new Mammal();
    mammal.eat();
    mammal.giveBirth();
    Bird bird = new Bird();
    bird.fly();
    bird.eat();
}

