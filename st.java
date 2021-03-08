package Student_information;

import Student_information.dob;
import Student_information.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class st {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String name,PRN;
            int choice,add_ch,date,month,year,pos;
            ArrayList<Student> studentList=new ArrayList<Student>();
            System.out.println("\t\tStudent Record");
            System.out.println("enter total no. of records: \n");
            Student s=new Student();
            s.user_input();
            studentList.add(s);
            while(true)
            {
                System.out.println("\t\t\tMenu for student class Implementation");
                System.out.println("1. Add new student");
                System.out.println("2. Display student list");
                System.out.println("3. Search by PRN");
                System.out.println("4. Search by Name");
                System.out.println("5. Search by position");
                System.out.println("6. Edit a record");
                System.out.println("7. Delete");
                System.out.println("8. Sort");
                System.out.println("9. Display count of students of each grade");
                System.out.println("10. Exit");
                System.out.println(("Enter choice: "));
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("1. Use default constructor");
                        System.out.println("2. Use parametarized constructor");
                        add_ch=sc.nextInt();
                        switch(add_ch)
                        {
                            case 1:
                                s=new Student();
                                s.user_input();
                                studentList.add(s);
                                break;

                            case 2:
                                System.out.print("\nEnter name : ");
                                sc.nextLine();
                                name=sc.nextLine();
                                System.out.print("\nEnter PRN : ");
                                PRN=sc.nextLine();
                                System.out.println("\nEnter a valid date of birth : ");
                                System.out.print("Enter date : ");
                                date=sc.nextInt();
                                System.out.println("Enter month : ");
                                month=sc.nextInt();
                                System.out.println("Enter year : ");
                                year=sc.nextInt();
                                s=new Student(PRN,name,date,month,year);
                                studentList.add(s);
                                break;

                            default:
                                System.out.println("Enter a valid option");
                        }
                        break;

                    case 2:
                        for(Student S:studentList)
                            S.display();
                        break;

                    case 3:
                        System.out.println("Enter PRN to search : ");
                        sc.nextLine();
                        PRN=sc.nextLine();
                        boolean PRNfound=false;
                        for(Student S:studentList)
                        {
                            if(PRN.equals(S.ret_PRN()))
                            {
                                S.display();
                                PRNfound=true;
                                break;
                            }
                        }
                        if(!PRNfound)
                            System.out.println("PRN not found");
                        break;

                    case 4:
                        System.out.println("Enter a name to search : ");
                        sc.nextLine();
                        name=sc.nextLine();
                        boolean nameFound=false;
                        for(Student S:studentList)
                        {
                            if(name.equals(S.ret_Name()))
                            {
                                S.display();
                                nameFound=true;
                            }
                        }
                        if(!nameFound)
                            System.out.println("Name not found");
                        break;

                    case 5:
                        System.out.println("Enter position to search record : ");
                        pos=sc.nextInt();
                        int i=1;
                        for(Student S:studentList)
                        {
                            if(i==pos)
                            {
                                S.display();
                                break;
                            }
                            i++;
                        }
                        if(i<pos)
                            System.out.println("Not enough no of records!");
                        break;

                    case 6:
                        System.out.println("Enter PRN to edit : ");
                        sc.nextLine();
                        PRNfound=false;
                        PRN=sc.nextLine();
                        for(Student S:studentList)
                        {
                            if(PRN.equals(S.ret_PRN()))
                            {
                                System.out.println("Record found!");
                                PRNfound=true;
                                S.edit();
                                break;
                            }
                        }
                        if(!PRNfound)
                            System.out.println("PRN not found");
                        break;

                    case 7:
                        System.out.println("Enter PRN to edit : ");
                        sc.nextLine();
                        PRNfound=false;
                        PRN=sc.nextLine();
                        for(Student S:studentList)
                        {
                            if(PRN.equals(S.ret_PRN()))
                            {
                                System.out.println("Record found!");
                                studentList.remove(S);
                                PRNfound=true;
                                System.out.println("Record deleted!");
                                break;
                            }
                        }
                        if(!PRNfound)
                            System.out.println("PRN not found");
                        break;

                    case 8:
                        Collections.sort(studentList,new Comparator<Student>()
                        {
                            @Override
                            public int compare(Student s1,Student s2)
                            {
                                return Float.compare(s2.ret_perc(),s1.ret_perc());
                            }
                        });
                        System.out.println("List sorted!");
                        for(Student S:studentList)
                            S.display();
                        break;

                    case 9:
                        int gr_count[]=new int[6];
                        for(Student S:studentList)
                        {
                            if(S.ret_grade().equals("A+"))
                                gr_count[0]++;
                            else if(S.ret_grade().equals("A"))
                                gr_count[1]++;
                            else if(S.ret_grade().equals("B+"))
                                gr_count[2]++;
                            else if(S.ret_grade().equals("B"))
                                gr_count[3]++;
                            else if(S.ret_grade().equals("C"))
                                gr_count[4]++;
                            else if(S.ret_grade().equals("F"))
                                gr_count[5]++;
                        }
                        System.out.println("Number of students with grade A+ : " + gr_count[0]);
                        System.out.println("Number of students with grade A : " + gr_count[1]);
                        System.out.println("Number of students with grade B+ : " + gr_count[2]);
                        System.out.println("Number of students with grade B : " + gr_count[3]);
                        System.out.println("Number of students with grade C : " + gr_count[4]);
                        System.out.println("Number of students with grade F : " + gr_count[5]);
                        break;

                    case 10:
                        System.out.println("Manual Exit");
                        sc.close();
                        Student.exit();
                        dob.exit();
                        System.exit(0);

                    default:
                        System.out.println("Invalid value!");

                }
            }
        }
    }
