package Permutations;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> lis = new ArrayList<>();
        boolean[] vis = new boolean[arr.length];
        perms(arr,vis,new ArrayList<>(),lis);
        System.out.println(lis);
    }

    public static void perms(int[] arr,boolean[] vis,List<Integer> lis,List<List<Integer>> res)
    {
        if(lis.size() == arr.length)
        {
            res.add(new ArrayList<>(lis));
        }

        for(int i=0;i<arr.length;i++)
        {
            if(!vis[i])
            {
                lis.add(arr[i]);
                vis[i] = true;
                perms(arr,vis,lis,res);
                lis.remove(lis.size()-1);
                vis[i] = false;
            }
        }

    }
}





