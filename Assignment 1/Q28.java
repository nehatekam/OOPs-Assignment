import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        } 
        int sum =0;
        for(int i=0;i<n;i++){ 
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of Odd Number : "+sum);
    }
}
