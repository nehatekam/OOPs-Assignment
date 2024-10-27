
import java.util.Arrays;
import java.util.Scanner;


public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i,j,frequency;
        for(i=0;i<arr.length;i++){
            frequency=1;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    frequency++;
                }else{
                    break;
                }
            }
            i=j-1;
            if(frequency > 1){
            
               //printing the output
               System.out.println(arr[i] + " --> " + frequency);
            }
        }
    }
}
