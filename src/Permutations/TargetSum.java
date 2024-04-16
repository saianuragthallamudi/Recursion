package Permutations;

import java.util.ArrayList;
import java.util.List;

/// LeetCode 494
public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        List<List<Integer>> lis = new ArrayList<>();
        int count = ways(arr,0,target,new ArrayList<>(),lis);
        System.out.println(count);
        System.out.println(lis);
    }

    public static int ways(int[] arr, int ind, int target, List<Integer> lis, List<List<Integer>> res)
    {
        if(ind == arr.length)
        {
            if(target == 0 )
            {
                res.add(new ArrayList<>(lis));
                return 1;
            }
            return 0;
        }
        int ans = 0;
        lis.add(arr[ind]);
        ans = ans + ways(arr,ind+1,target-arr[ind],lis,res);
        lis.remove(lis.size()-1);
        lis.add(-arr[ind]);
        ans = ans + ways(arr,ind+1,target+arr[ind],lis,res);
        lis.remove(lis.size()-1);
        return ans;
    }
}
