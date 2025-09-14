public class VaildPalindrome {

    public static void isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(!(ch>='a' && ch<='z')){
                continue;
            }else{
                str += ch;
            }
        }
        System.out.println(str);

    }

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        isPalindrome(str);

    }
}
