package Subsequences;

//Given an array, return all the subsets that produce the given target sum;

import java.util.ArrayList;
import java.util.List;

public class PerfectSum {

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,1};
        int target = 8;
        List<List<Integer>> res = new ArrayList<>();
        helper(arr,0,8,new ArrayList<>(),res);
        System.out.println(res);
    }

    public static void helper(int[] arr, int ind, int sum, List<Integer> lis, List<List<Integer>> res)
    {

//        return;
        if(ind == arr.length)
        {
            if(sum == 0)
            {
                res.add(new ArrayList<>(lis));
            }
            return;
        }
        helper(arr,ind+1,sum,lis,res);
        lis.add(arr[ind]);
        helper(arr,ind+1,sum-arr[ind],lis,res);
        lis.remove(lis.size()-1);
    }
}
