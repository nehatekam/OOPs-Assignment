
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Alternate Number : ");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
