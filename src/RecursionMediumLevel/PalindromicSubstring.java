package RecursionMediumLevel;


// Leetcode 131

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "aabb";
        List<List<String>> res = new ArrayList<>();
        helper(0,str,new ArrayList<>(),res);
        System.out.println(res);
    }

    public static void helper(int ind, String str, List<String> lis, List<List<String>> res)
    {
        if(ind == str.length())
        {
            res.add(new ArrayList<>(lis));
        }

        for(int i=ind;i<str.length();i++)
        {
            //System.out.println(str.substring(ind,i+1));
            if(isPalindrome(str.substring(ind,i+1)))
            {
                lis.add(str.substring(ind,i+1));
                helper(i+1,str,lis,res);
                lis.remove(lis.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String str)
    {
        int s = 0;
        int e = str.length()-1;
        while(s<e)
        {
            if(str.charAt(s) != str.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
