public class Q20 {
    public static void main(String[] args) {
        try{
            int[] negative = new int[-5];
            int a = 50/0;
        }catch(NegativeArraySizeException e){
            System.out.println("Negative Size Array");
        }catch(ArithmeticException e){
            System.out.println("A not divides B");
        }
        System.out.println("Rest of the code");
    }
}
