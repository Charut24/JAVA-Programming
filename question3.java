package assignment2;

import java.util.Scanner;

public class question3
{
    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0
    }
    public static void main(String[] args)
    {
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of elements: ");
        total = sc.nextInt();
        int a[] = new int[0];
        a = new int[total];
        System.out.println("Enter the elements: ");
        for(int i=0;i<total;i++)
            a[i]=sc.nextInt();
        System.out.println("\n Second smallest element: "+getSecondSmallest(a,total));

    }
}
