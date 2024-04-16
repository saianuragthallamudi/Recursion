package Subsequences;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequences {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        generate(arr,0,new ArrayList<>(),res);
        System.out.println(res);
    }

    public static void generate(int[] arr, int ind, List<Integer> lis, List<List<Integer>> res)
    {
        if(ind == arr.length)
        {
            res.add(new ArrayList<>(lis));
            return;
        }
        // not include , include
        generate(arr,ind+1,lis,res);
        lis.add(arr[ind]);
        generate(arr,ind+1,lis,res);
        lis.remove(lis.size()-1);

        //include, not include
//        lis.add(arr[ind]);
//        generate(arr,ind+1,lis,res);
//        lis.remove(lis.size()-1);
//        generate(arr,ind+1,lis,res);
    }
}
