public class  Ronaldo{
    private  String name;
    private  int age;
    private int aerial;
    public Ronaldo (String name , int age , int aerial) {
        this.name = name;
        this.age = age;
        this.aerial = aerial;

    }
  public  void displayinfo(){
        System.out.println("name: " + name);
        System.out.println("age:" + age);
        System.out.println("aerial balls" + aerial);
    }
    void Training (){
        System.out.println("the player likes to train :");
    }
    void ego(){
        System.out.println("the player likes to boast:");
    }
    void  discrimated(){
        System.out.println("the player faces a lot of critics and unfairness");
    }
}
 class Garnacho extends Ronaldo{

    public Garnacho(String name, int age, int aerial) {
        super(name, age, aerial);
        
    }
    void Speed(){
        System.out.println("the player is also fast");
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
    }
}
public static void main(String[] args){
    Garnacho player = new Garnacho("junior", 21, 1);
    player.Speed();
    player.Training();
    player.discrimated();
    player.displayinfo();
}


