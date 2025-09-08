import java.util.*;
public class LargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextInt()){
            System.out.println("Invalid input");
            return;
        }
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
            if(!scan.hasNextInt()){
                System.out.println("Invalid input");
                return;
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[n-1]);

        scan.close();
    }
}
