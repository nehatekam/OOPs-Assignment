class Commmission {
    private float sales;
     Commmission(float sales){
       this.sales=sales;
     }
     void Commission(){
          if(sales<=0){
             System.out.println("Invalid input");
             return;
         }
         System.out.println("The commmission for sales: "+sales+" is ");
 
         double c=(sales*0.1)/100;//rate of 10%
         System.out.println(c);
     }
 }
public class Q33 {
    public static void main(String[] args) {
        Commmission a =new Commmission(10000);
        a.Commission();
        
    }
}
