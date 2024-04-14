package Recursion_Basic_Problems.Recursion_In_Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "anurag";
        System.out.println(reverse(str,str.length()-1,""));
    }

    public static String reverse(String str, int i,String res)
    {
        if(i == 0) {
            res = res + str.charAt(i);
            return res;
        }
        return reverse(str,i-1,res+str.charAt(i));
    }
}
