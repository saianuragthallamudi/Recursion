package Subsequences;

public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {3,6,4,5};
        int target = 16;
        System.out.println(check(arr,0,target));
    }

    public static boolean check(int[] arr,int ind,int target)
    {
        if(target == 0)
        {
            return true;
        }
        if(ind == arr.length)
        {
            return false;
        }
        return check(arr,ind+1,target) || check(arr,ind+1,target-arr[ind]);
    }

}
