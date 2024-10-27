class Num{
    int number;
    public Num(int number){
        this.number=number;
    }
    public void showNum(){
        System.out.println("Number : "+number);
    }
}
class HexaNum extends Num{
    public HexaNum(int number){
        super(number);
    }
    @Override
    public void showNum(){
        System.out.println("Number : "+number);
        System.out.println("HexaDecimal :"+Integer.toHexString(number));
        System.out.println("Octol : "+Integer.toOctalString(number));
    }
}
public class Q11 {
    public static void main(String[] args) {
        Num num = new Num(255);
        num.showNum();
        HexaNum hexnum = new HexaNum(255);
        hexnum.showNum();
        
    }
}
