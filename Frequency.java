import java.util.*;
public class Frequency {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("ashwanth");
        String rel = "";
        int n = str.length();

        for(int i=0; i<n-1; i++){
            char ch1 = str.charAt(i);
            int count = 1;
            boolean flag = false;
            for(int j=0; j<i; j++){
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            for(int j = i+1; j<n; j++){
                if(str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }

            System.out.println(str.charAt(i)+" "+count);
            
        }

    }
}
