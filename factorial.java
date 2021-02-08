import java.io.BufferedReader;
import java.io.*;
import java.lang.*;
import java.io.InputStreamReader;
import java.util.Scanner;


public class factorial
{
    public static void main(String[] args)
    {
        int choice, num, i;
        char ch;
        float fact=1;

        try
        {
            do
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Select from the following: ");
                System.out.println("1. Factorial using command line argument. ");
                System.out.println("2. Factorial using Scanner. ");
                System.out.println("3. Fibonacci using BufferedReader. ");
                System.out.println("4. Fibonacci using DataInputStream Console. ");
                System.out.println("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\n *******************USING COMMAND LINE ARGUMENT******************* \n ");
                        num = Integer.parseInt(args[0]);
                        for (i = 1; i <= num; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Factorial of number is: " + fact);
                    }
                    case 2 -> {
                        System.out.println("\n *********************USING SCANNER*********************\n ");
                        Scanner f = new Scanner(System.in);
                        System.out.println("Enter the number: ");
                        num = f.nextInt();
                        for (i = 1; i <= num; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Factorial of number is: " + fact);
                    }
                    case 3 -> {
                        System.out.println("\n *********************USING BUFFEREDREADER*********************\n ");
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter the value:");
                        num = Integer.parseInt(br.readLine());
                        int t1 = 0, t2 = 1;
                        System.out.print("Fibonacci Series is " + t1 + " " + t2);
                        for (i = 0; i < num; i++) {
                            int t3 = t1 + t2;
                            t1 = t2;
                            t2 = t3;
                            System.out.print(" " + t3);
                        }
                    }
                    case 4 -> {
                        System.out.println("\n *********************USING DATAINPUTSTREAM CONSOLE*********************\n ");
                        int f1 = 0, f2 = 1, f3, n;
                        DataInputStream dr = new DataInputStream(System.in);
                        System.out.println("Enter the number : ");
                        String s;
                        s = dr.readLine();
                        n = Integer.parseInt(s);
                        System.out.print("Fibonacci Series is " + f1 + " " + f2);
                        for (i = 0; i < n; i++) {
                            f3 = f1 + f2;
                            f1 = f2;
                            f2 = f3;
                            System.out.print(" " + f3);
                        }
                    }
                    default -> System.out.println("WRONG CHOICE. ");
                }
                Scanner c = new Scanner(System.in);
                System.out.println("\n Enter 'Y' to contine.");
                ch = c.next().charAt(0);
            }while (ch == 'Y');
        }

        catch (Exception e){}
    }
}
