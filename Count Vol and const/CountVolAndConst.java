import java.util.*;
public class CountVolAndConst{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(!((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z'))){
                System.out.println("Invalid input");
                return;
            }
        }

        int vol = 0, cons = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                vol++;
            }else{
                cons++;
            }
        } 
        System.out.println(vol);
        System.out.println(cons);

        scan.close();
    }
}