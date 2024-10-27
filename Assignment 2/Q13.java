class shape{
    void draw(){
        System.out.println("Drawing the shape ");
    }
}
class Rectangle extends  shape{
    void drawRect(){
        System.out.println("Drawing the Rectangle");
    }
}
class Circle extends Rectangle{
    void drawCircle(){
        System.out.println("Drawing the Circle ");
    }
}
public class Q13 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.drawCircle();
        c.drawRect();
    }
}
