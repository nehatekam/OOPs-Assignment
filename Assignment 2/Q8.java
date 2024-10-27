class Parent{
    public static void display(){
        System.out.println("Parent Class");
    }
}
class child extends Parent{
    public static void display(){
        System.out.println("Child Class");
    }
}
public class Q8 {
    public static void main(String[] args) {
        Parent p = new child();
        p.display();
    }
}
