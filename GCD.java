import java.util.*;

public class GCD
{
    static int gcd(int a, int b)
    {
        if (a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers whose GCD you want to find: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is : "+gcd(a,b));
        sc.close();
    }
}
