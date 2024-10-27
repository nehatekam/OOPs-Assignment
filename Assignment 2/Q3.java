class Detial{
    String name;
    int age;
    public Detial(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Detial a = new Detial("Yadvendra", 18);
        a.display();
    }
}
