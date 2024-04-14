package Recursion_Basic_Problems.Recursion_In_Strings;

public class CountVowels {

    public static void main(String[] args) {
        String str = "eilai";
        System.out.println(getVowelCount(str,0,str.length()));
    }

    public static int getVowelCount(String str,int i,int n)
    {
        if(i == n)
        {
            return 0;
        }
        if(isVowel(str.charAt(i)))
        {
            return 1 + getVowelCount(str,i+1,n);
        }
        else{
            return getVowelCount(str,i+1,n);
        }
    }

    public static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            return true;
        }
        return false;
    }
}
