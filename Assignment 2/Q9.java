import java.util.Scanner;

abstract  class ThreeDObject{
    abstract double wholeSurfaceArea();
    abstract double volume();
}
class Box extends ThreeDObject{
    double length,width,height;
    Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    @Override
    double wholeSurfaceArea(){
        return 2*(length*width+width*height+height*length);
    }
    @Override
    double volume(){
        return length*width*height;
    }
}
class Cube extends ThreeDObject{
    double side;
    Cube(double side){
        this.side=side;
    }
    @Override
    double wholeSurfaceArea(){
        return 6*side*side;
    }
    @Override
    double volume(){
        return side*side*side;
    }
}
class Cylinder extends ThreeDObject{
    double radius,height;
    Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    double wholeSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    @Override
    double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Cone extends ThreeDObject{
    double radius,height;
    Cone(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    double wholeSurfaceArea(){
        double slantHeight =Math.sqrt(radius*radius+height*height);
        return Math.PI*radius*(radius+slantHeight);
    }
    double volume(){
        return (1.0/3)*Math.PI*radius*radius*height;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Box
        System.out.println("Enter the dimensions of the box (length, width, height): ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length,width,height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());
        //Cube
        System.out.println("Enter the side of the cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " +cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
        //Cylinder
        System.out.println("Enter the dimensions of the Cylinder (radius,height): ");
        double radius = sc.nextDouble();
        height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        //Cone
        System.out.println("Enter the dimensions of the Cone (radius, height): ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
        sc.close();


    }
}
