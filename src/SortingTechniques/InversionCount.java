package SortingTechniques;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        System.out.println(inversionCount(arr,0,arr.length-1));
    }
    public static int inversionCount(int[] arr,int s,int e)
    {
        if(s == e)
        {
            return 0;
        }
        int mid = (s+e)/2;
        int l_count = inversionCount(arr,s,mid);
        int r_count = inversionCount(arr,mid+1,e);
        int t_count = merge(arr,s,e,mid);
        return l_count+r_count+t_count;
    }

    public static int merge(int[] arr,int s,int e,int mid)
    {
        int[] temp = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        int count = 0;

        while(i<=mid && j<=e)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                k++;
                i++;
            }
            else if(arr[j] < arr[i]){
                temp[k] = arr[j];
                count = count + mid-i+1;
                k++;
                j++;
            }
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
        return count;
    }
}
