class Vehicle{
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public Vehicle(String regnNumber,int speed,String color,String ownerName){
        this.regnNumber=regnNumber;
        this.speed=speed;
        this.color=color;
        this.ownerName=ownerName;
    }
    public void showData(){
        System.out.println("This the Vehicle : ");
        System.out.println("Registration Number : "+regnNumber);
        System.out.println("Speed : "+speed);
        System.out.println("Color : "+color);
        System.out.println("Owner Name : "+ownerName);
    }
}
class Bus extends  Vehicle{
    private  int routeNumber;
    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber){
        super(regnNumber, speed, color, ownerName);
        this.routeNumber=routeNumber;
    }
    @Override
    public void showData(){
        super.showData();
        System.out.println("Bus Route Number : "+routeNumber);
    }
}
class Car extends Vehicle{
    private String manfucatureName;
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manfucatureName=manfucatureName;
    }
    public void showData(){
        super.showData();
        System.out.println("Car Manfacture Name : "+manfucatureName);
    }
}
public class Q10 {
    public static void main(String[] args) {
        Bus bus = new Bus("MH12AB1234", 80, "Red", "Aayush", 45);
        Car car = new Car("MH14CD5678", 120, "Blue", "Vikarm", "Toyota");
        System.out.println("Bus Detial :");
        bus.showData();
        System.out.println();
        System.out.println("Car Detial : ");
        car.showData();

    }
}
