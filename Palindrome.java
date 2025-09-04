import java.util.*;
public class Palindrome { 
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch == ' '))){
                System.out.println("Invalid input");
                return;
            }
        }
        boolean flag = false;
        for(int i=0; i<n/2; i++){
            char f = str.charAt(i);
            char l = str.charAt(n-1-i);
            if(f == l){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
