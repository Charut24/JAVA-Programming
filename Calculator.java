package Calculator;

import java.util.*;
import java.lang.Math;

public class Calculator
{
    static int add(int a,int b)
    {
        return a+b;
    }

    static int sub(int a,int b)
    {
        if (a>b)
            return a-b;
        else
            return b-a;
    }

    static int multi(int a,int b)
    {
        return a*b;
    }

    static int divide(int a,int b)
    {
        return a/b;
    }

    static int mean(int arr[] , int n)
    {
        double sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        return (int) (sum/n);
    }

    static int variance(int arr[], int n)
    {
        double sum=0;
        for(int i=0;i<n;i++)
            sum=sum+(arr[i]*arr[i]);
        sum/=n;
        return (int) (sum-Math.pow(mean(arr,n),2));
    }

    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int a, b, choice, no,pow;
        char ch;

        try
        {
            do
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Select from following: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square root");
                System.out.println("6. Power");
                System.out.println("7. Mean");
                System.out.println("8. Variance");
                System.out.println("Enter choice: ");
                choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter the first number: ");
                        a=sc.nextInt();
                        System.out.println("Enter second number: ");
                        b=sc.nextInt();
                        System.out.println("Addition = "+add(a,b));
                        break;

                    case 2:
                        System.out.println("Enter the first number: ");
                        a=sc.nextInt();
                        System.out.println("Enter second number: ");
                        b=sc.nextInt();
                        System.out.println("Subtraction = "+sub(a,b));
                        break;

                    case 3:
                        System.out.println("Enter the first number: ");
                        a=sc.nextInt();
                        System.out.println("Enter second number: ");
                        b=sc.nextInt();
                        System.out.println("Multiplication = "+multi(a,b));
                        break;

                    case 4:
                        System.out.println("Enter the first number: ");
                        a=sc.nextInt();
                        System.out.println("Enter second number: ");
                        b=sc.nextInt();
                        if (b==0)
                            System.out.println("Division not possible.");
                        else
                            System.out.println("Division = "+divide(a,b));
                        break;

                    case 5:
                        System.out.println("Enter the number: ");
                        no = sc.nextInt();
                        System.out.println("Square root of number is: "+Math.sqrt(no));
                        break;

                    case 6:
                        System.out.println("Enter the number: ");
                        no = sc.nextInt();
                        System.out.println("Enter the power: ");
                        pow = sc.nextInt();
                        System.out.println("Result: "+Math.pow(no,pow));
                        break;

                    case 7:
                        System.out.println("Enter no of elements: ");
                        a=sc.nextInt();
                        int[] arr = new int[0];
                        arr = new int[a];
                        System.out.println("Enter elements until prompted otherwise: ");
                        for(b=0;b<a;b++)
                            arr[b]=sc.nextInt();
                        System.out.println("Mean of entered numbers : "+mean(arr,a));
                        break;

                    case 8:
                        System.out.println("Enter no of elements: ");
                        a=sc.nextInt();
                        arr= new int[a];
                        System.out.println("Enter elements until prompted otherwise: ");
                        for(b=0;b<a;b++)
                            arr[b]=sc.nextInt();
                        System.out.println("Variance of entered numbers : "+variance(arr,a));
                        break;

                    default:
                        System.out.println("WRONG CHOICE.");
                }System.out.println("Enter Y to continue. ");
                ch = sc.next().charAt(0);
            }while(ch =='Y');
        }
        catch (Exception e){}

    }
}
