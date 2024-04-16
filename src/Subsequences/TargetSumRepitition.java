package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class TargetSumRepitition {

    public static void main(String[] args) {
        int[] arr = {1,5,6};
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        targetSum(arr,0,target,new ArrayList<>(),res);
        System.out.println(res);
    }

    public static void targetSum(int[] arr, int ind,int target, List<Integer> lis, List<List<Integer>> res)
    {
        if(target < 0)
        {
            return;
        }
        if(target == 0)
        {
            res.add(new ArrayList<>(lis));
            return;
        }
        if(ind == arr.length)
        {
            return;
        }

        lis.add(arr[ind]);
        targetSum(arr,ind,target-arr[ind],lis,res);
        lis.remove(lis.size()-1);
        targetSum(arr,ind+1,target,lis,res);
    }
}
