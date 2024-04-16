package Permutations;

import java.util.ArrayList;
import java.util.List;

public class WaysToSumN {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int sum = 3;
        List<List<Integer>> lis = new ArrayList<>();
        int count = helper(arr,sum,new ArrayList<>(),lis);
        System.out.println(count);
        System.out.println(lis);
    }

    public static int helper(int[] arr,int sum,List<Integer> lis,List<List<Integer>> res)
    {
        if(sum == 0)
        {
            res.add(new ArrayList<>(lis));
            return 1;
        }
        if(sum < 0)
        {
            return 0;
        }
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            lis.add(arr[i]);
            ans = ans + helper(arr,sum-arr[i],lis,res);
            lis.remove(lis.size()-1);
        }
        return ans;
    }
}
