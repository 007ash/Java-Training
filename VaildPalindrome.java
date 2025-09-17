public class VaildPalindrome {
    public static boolean isPalindrome(String s) {
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
        boolean flag = true;
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(str.length()-1-i);
            if(!(ch1 == ch2)){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));

    }
}
