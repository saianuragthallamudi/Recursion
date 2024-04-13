public class Fast_Power_Itr {

    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int res = power(3,4);
        System.out.println(res);
    }

    public static int power(int x,int n)
    {
        int res = 1;

        while(n > 0) {

            if(n%2 == 1)
            {
                res = res * x;
                n=n-1;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }
}
