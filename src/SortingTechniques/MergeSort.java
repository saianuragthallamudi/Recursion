package SortingTechniques;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,6,4};
        int[] res = mergeSort(arr,0,arr.length-1);
        printArr(res);
    }

    public static int[] mergeSort(int[] arr,int s,int e)
    {
        if(s == e)
        {
            return arr;
        }
        int mid = (s+e)/2;
        arr = mergeSort(arr,s,mid);
        arr = mergeSort(arr,mid+1,e);
        return merge(arr,s,e,mid);
    }

    public static int[] merge(int[] arr,int s,int e,int mid)
    {
        int[] temp = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=e)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=e)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        k=0;
        for(i=s;i<=e;i++)
        {
            arr[i] = temp[k];
            k++;
        }
        return arr;
    }

    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
