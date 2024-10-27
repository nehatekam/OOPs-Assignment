class Eat{
    public void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Eat{
    public void bark(){
        System.out.println("Barking..");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();;
        d.bark();
    }
}
