package Recursion_Basic_Problems.Recursion_In_Strings;

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "level";
        System.out.println(checkPalindrome(str,0,str.length()-1));
    }

    public static boolean checkPalindrome(String str,int s,int e)
    {
        if(s>=e)
        {
            return true;
        }
        if(str.charAt(s) != str.charAt(e))
        {
            return false;
        }
        return checkPalindrome(str,s+1,e-1);
    }
}
