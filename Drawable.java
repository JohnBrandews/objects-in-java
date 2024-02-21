interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing a circle");
    }
}
public static  void main(String[] args){
    Drawable circle = new Circle();
    circle.draw();
}
