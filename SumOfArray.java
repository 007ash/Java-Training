import java.util.*;
public class SumOfArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextInt()){
            System.out.println("Invalid input");
            return;
        }

        int n = scan.nextInt();
        int arr[]  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    
        scan.close();
    }
}
