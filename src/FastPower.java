public class FastPower {
    public static int power(int x,int n)
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
        System.out.println(power(3,4));
    }
}