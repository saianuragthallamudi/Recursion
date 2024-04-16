package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Sum {
    public static void main(String[] args) {
        int[] arr = {3,6,4,5};
        List<Integer> lis = new ArrayList<>();
        generate(arr,0,0,lis);
        System.out.println(lis);
    }

    public static void generate(int[] arr,int ind,int sum,List<Integer> res)
    {
        if(ind == arr.length)
        {
            res.add(sum);
            return;
        }

        generate(arr,ind+1,sum,res);
        generate(arr,ind+1,sum+arr[ind],res);
    }
}
