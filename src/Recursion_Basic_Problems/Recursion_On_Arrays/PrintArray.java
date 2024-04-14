package Recursion_Basic_Problems.Recursion_On_Arrays;

public class PrintArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        printArrRev(arr,0,len);
    }

    public static void printArr(int[] arr,int i,int n)
    {
        if(i == n)
        {
            return;
        }
        System.out.println(arr[i]);
        printArr(arr,i+1,n);
    }

    public static void printArrRev(int[] arr,int i,int n)
    {
        if(i == n)
        {
            return;
        }
        printArrRev(arr,i+1,n);
        System.out.println(arr[i]);
    }
}
