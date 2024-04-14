package Recursion_Basic_Problems.Recursion_On_Arrays;

public class SumOfElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //int sum = getSum(arr,0,arr.length);
        int sum = getSum1(arr,arr.length-1);
        System.out.println(sum);
    }

    public static int getSum(int[] arr,int i,int n)
    {
        if(i == n)
        {
            return 0;
        }
        return arr[i] + getSum(arr,i+1,n);
    }

    public static int getSum1(int[] arr,int i)
    {
        if(i == 0){
            return arr[i];
        }
        return arr[i] + getSum1(arr,i-1);

    }
}
