public class Q17 {
    public static void main(String[] args) {
        int number=2415;
        String numStr = Integer.toString(number);
        int sum=0;
        for(int i=0;i<numStr.length()-1;i++){
            String consecutive = numStr.substring(i,i+2);
            int value = Integer.parseInt(consecutive);
            sum+=value;
        }
        System.out.println("Sum of the Consecutive Digit "+sum);
    }
}
