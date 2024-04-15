package SortingTechniques;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,6,4,7};
        quickSort(arr,0,arr.length-1);
        MergeSort m = new MergeSort();
        MergeSort.printArr(arr);
    }

    public static void quickSort(int[] arr,int s,int e)
    {
        if(s >= e)
        {
            return;
        }

        int pivot = e;
        int j = s;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]<arr[pivot])
            {
                swap(arr,i,j);
                j++;
            }
        }
        swap(arr,pivot,j);
        pivot = j;

        quickSort(arr,s,pivot-1);
        quickSort(arr,pivot+1,e);
    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
