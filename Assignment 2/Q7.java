class Animal{
    public void eating(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    @Override
    public void eating(){
        System.out.println("Dog Eating..");
    }
}
class Cat extends Animal{
    @Override
    public void eating(){
        System.out.println("Cat Eating..");
    }
}
public class Q7 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCaat = new Cat();
        myDog.eating();
        myCaat.eating();
    }
}
