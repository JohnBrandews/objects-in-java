package encapsulation;
//encapsulation
public class Encapsulate{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Encapsulate person = new Encapsulate();
        person.setName("john");
        person.setAge(23);
        System.out.println("name" + person.getName());
        System.out.println("age" + person.getAge());
    }
}