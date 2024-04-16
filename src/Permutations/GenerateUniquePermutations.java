package Permutations;

import java.util.*;

public class GenerateUniquePermutations {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};


        //Requires if we solve using sorting

        //Arrays.sort(arr);

        //Required if we are solving using hashmap

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++)
//        {
//            if(map.containsKey(arr[i]))
//            {
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//            else{
//                map.put(arr[i],1);
//            }
//        }
        List<List<Integer>> lis = new ArrayList<>();
        //perms(arr.length,map,new ArrayList<>(),lis); // hashmap
        //perms(0,arr,new ArrayList<>(),lis); // hashset
        perms(0,arr,new ArrayList<>(),lis);
        System.out.println(lis);
    }

    public static void perms(int ind,int[] arr,List<Integer> lis,List<List<Integer>> res)
    {
        if(ind == arr.length)
        {
            res.add(new ArrayList<>(lis));
            return;
        }

        for(int i=ind;i<arr.length;i++)
        {
            while(i<arr.length-1 && arr[i] == arr[i+1])
            {
                i++;
            }
            swap(arr,i,ind);
            lis.add(arr[ind]);
            perms(ind+1,arr,lis,res);
            swap(arr,i,ind);
            lis.remove(lis.size()-1);
        }
    }

    // Using HashSet

//    public static void perms(int ind,int[] arr,List<Integer> lis,List<List<Integer>> res)
//    {
//        if(ind == arr.length)
//        {
//            res.add(new ArrayList<>(lis));
//            return;
//        }
//
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=ind;i<arr.length;i++)
//        {
//            if(!set.contains(arr[i]))
//            {
//                lis.add(arr[i]);
//                swap(arr,ind,i);
//                perms(ind+1,arr,lis,res);
//                lis.remove(lis.size()-1);
//                swap(arr,ind,i);
//                set.add(arr[i]);
//            }
//        }
//    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // Using HashMap -- most efficient

//    public static void perms(int len,HashMap<Integer,Integer> map, List<Integer> lis,List<List<Integer>> res)
//    {
//        if(lis.size() == len)
//        {
//            res.add(new ArrayList<>(lis));
//            return;
//        }
//
//        for(Map.Entry<Integer,Integer> entry : map.entrySet())
//        {
//            if(entry.getValue() > 0)
//            {
//                lis.add(entry.getKey());
//                map.put(entry.getKey(),map.get(entry.getKey())-1);
//                perms(len,map,lis,res);
//                map.put(entry.getKey(), map.get(entry.getKey())+1);
//                lis.remove(lis.size()-1);
//            }
//        }
//    }

}
