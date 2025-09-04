import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(!((ch>='a'&& ch<='z')|| (ch>='A' && ch<='Z')||ch==' ')){
                System.out.println("Invalid input");
                return;
            }
        }
        StringBuilder rel = new StringBuilder("");
        for(int i= n-1; i>=0; i--){
            char ch = str.charAt(i);
            rel = rel.append(ch);
        }
        System.out.println(rel);
        scan.close();
    }
}
