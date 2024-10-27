class Addition{
    public int add(int a, int b){
    return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double  b){
        return a+b;
    }

}
public class Q6 {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Sum of two integer :"+a.add(2,4));
        System.out.println("Sum of three integer :"+a.add(2,4,6));
        System.out.println("Sum of two double :"+a.add(2.5,4.5));
    }
}
