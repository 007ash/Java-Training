import java.util.*;
public class HelloWorld{

    static int Sorting(int arr[], int n, int val){
        int rel = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == val){
                return rel+1;
            }
        }
        return rel;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextInt()){
            System.out.println("Invalid Input");
        }
        int num = scan.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
            if(arr[i] < 0){
                System.out.println("Invalid input");
            }
        }
        int pos = scan.nextInt();
        System.out.println(Sorting(arr,num,pos));
    }
}