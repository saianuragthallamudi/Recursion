public class FastPower {
    public static long power(long x,long n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
        {
            return x;
        }
        if(n%2 == 0)
        {
            return power(x*x,n/2);
        }
        else{
            return x*power(x,n-1);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        long val = power(2,8);
        System.out.println(val);
    }
}