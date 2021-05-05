package Assignment_6;


import java.lang.*;
import java.io.*;
import java.util.Scanner;

interface Exam {

    void percent_cal();
}

class Student {
    String name;
    int roll_no,mark1,mark2;

    Student(String n, int r, int m1, int m2) {

        name=n;
        roll_no=r;
        mark1=m1;
        mark2=m2;
    }

    void display() {

        System.out.println ("Name of Student: "+name);
        System.out.println ("Roll No. of Student: "+roll_no);
        System.out.println ("Marks of Subject 1: "+mark1);
        System.out.println ("Marks of Subject 2: "+mark2);
    }
}

class Result extends Student implements Exam {

    Result(String name, int roll_no, int mark1, int mark2) {

        super(name,roll_no,mark1,mark2);
    }

    public void percent_cal() {

        int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
    }

    void display() {

        super.display();
    }
}

public class MultipleInh {

    public static void main(String[] args) {
        String name;
        int roll_no, mark1, mark2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n ****************** INPUT DETAILS ******************\n ");
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No.: ");
        roll_no = sc.nextInt();
        System.out.println("Enter Mark1: ");
        mark1 = sc.nextInt();
        System.out.println("Enter Mark2: ");
        mark2 = sc.nextInt();
        //Result R = new Result("Ragini",12,93,84);
        Result R = new Result(name,roll_no,mark1,mark2);
        System.out.println("\n\n ****************** RESULT ******************\n ");
        R.display();
        R.percent_cal();
    }
}