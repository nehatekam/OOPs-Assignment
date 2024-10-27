
import java.util.Arrays;
import java.util.Scanner;


public class Q1 {
    public static int[]SortedArray(int[]A,int[]B){
        int n1 = A.length;
        int n2 = B.length;

        int [] C = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }
        while(i<n1){
            C[k++]=A[i++];
        }
        while(j<n2){
            C[k++]=B[j++];
        }
        return C;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Array 1 : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of Array 2 : ");
        int m = sc.nextInt();
        int [] A = new int[n];
        int [] B = new int[m];
        System.out.println("Enter the input of Array 1 : ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the input of Array 2 : ");
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }
        int [] C=SortedArray(A, B);
        System.out.println("Merged Array: "+Arrays.toString(C));
        


    }
}
