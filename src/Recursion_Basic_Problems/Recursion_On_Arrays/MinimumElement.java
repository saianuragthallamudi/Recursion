package Recursion_Basic_Problems.Recursion_On_Arrays;

public class MinimumElement {

    public static void main(String[] args) {
        int[] arr = {7,2,4,1,6};
        int min_ele = getMinElement(arr,0,arr.length-1);
        System.out.println(min_ele);
    }

    public static int getMinElement(int[] arr,int i,int n)
    {
        if(i == n)
        {
            return arr[i];
        }
        return Math.min(arr[i],getMinElement(arr,i+1,n));
    }
}
