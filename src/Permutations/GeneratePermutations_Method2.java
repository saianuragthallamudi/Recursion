package Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePermutations_Method2 {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<int[]> lis = new ArrayList<>();
        perms(arr,0,lis);
        for(int[] ele : lis)
        {
            for(int i=0;i<ele.length;i++)
            {
                System.out.print(ele[i]+" ");
            }
            System.out.println();
        }
    }

    public static void perms(int[] arr,int ind,List<int[]> res)
    {
        if(ind == arr.length)
        {
            res.add(arr.clone());
        }

        for(int i=ind;i<arr.length;i++)
        {
            swap(arr,i,ind);
            perms(arr,ind+1,res);
            swap(arr,i,ind);
        }
    }

    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
