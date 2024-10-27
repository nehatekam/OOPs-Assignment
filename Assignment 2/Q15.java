class Student{
    private int Roll_Number;
    public Student(int Roll_Number){
        this.Roll_Number=Roll_Number;
    }
    public void show(){
        System.out.println("Roll Number : "+Roll_Number);
    }
}
public class Q15 {
    public static void main(String[] args) {
        Student std = new Student(23);
        std.show();
    }
}
