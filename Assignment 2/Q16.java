class Myclass{
    static int staticVariable = 10;
    static void staticMethod(){
        System.out.println("The Static Variable : "+staticVariable);
    }
}
public class Q16 {
    public static void main(String[] args) {
        Myclass.staticMethod();
    }
}
