package Student_information;

import java.util.Scanner;
import java.util.regex.Pattern;

    class Student {
        private String PRN;
        private String Name;
        private dob DOB;
        private int[] marks = new int[5];
        private int[] max_marks = new int[5];
        private int max_total = 0;
        private int obt_total = 0;
        private float perc;
        private String grade;
        static Scanner sc;

        static {
            sc = new Scanner(System.in);
        }

        Student() {
            this.DOB = new dob();
            this.Name = null;
            this.PRN = null;
        }

        Student(String PRN, String Name, int date, int month, int year) {
            sc.nextLine();

            try {
                while(!this.validatePRN(PRN)) {
                    System.out.println("Invalid PRN! Enter again");
                    PRN = sc.nextLine();
                }

                this.PRN = PRN;
                this.Name = Name;
                this.DOB = new dob(date, month, year);
                this.inputMaxMarks();
                this.input_marks();
                this.total();
            } catch (Exception var7) {
                System.out.println(var7.toString());
            }

        }

        public String ret_grade() {
            return this.grade;
        }

        public String ret_PRN() {
            return this.PRN;
        }

        public String ret_Name() {
            return this.Name;
        }

        public float ret_perc() {
            return this.perc;
        }

        public static void exit() {
            System.out.println("Exiting Student...");
            sc.close();
        }

        public void edit() {
            System.out.println("PRN: " + this.PRN);
            System.out.println("Name : " + this.Name);
            System.out.print("Press 1 to edit, 0 to retain current name: ");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.print("Enter new name : ");
                sc.nextLine();
                this.Name = sc.nextLine();
                System.out.println("Name changed!");
            } else {
                System.out.println("No changes!Old name retained!");
            }

            for(int i = 0; i < this.marks.length; ++i) {
                System.out.println("Marks in subject " + (i + 1) + " : " + this.marks[i] + "/" + this.max_marks[i]);
                System.out.print("Maximum marks : Press 1 to edit, 0 to retain current marks: ");
                opt = sc.nextInt();
                if (opt != 1) {
                    System.out.println("Retaining old marks!");
                } else {
                    System.out.println("Enter new marks : ");

                    for(this.max_marks[i] = sc.nextInt(); this.max_marks[i] <= 0; this.max_marks[i] = sc.nextInt()) {
                        System.out.println("Invalid marks entered!");
                    }

                    System.out.println("Marks updated");
                }

                System.out.print("\nObtained marks : Press 1 to edit, 0 to retain current marks");
                opt = sc.nextInt();
                if (opt != 1 && this.validateMarks(this.marks[i], i)) {
                    System.out.println("Retaining old marks!");
                } else {
                    System.out.println("Enter new marks : ");

                    for(this.marks[i] = sc.nextInt(); !this.validateMarks(this.marks[i], i); this.marks[i] = sc.nextInt()) {
                        System.out.println("Invalid marks entered!");
                    }

                    System.out.println("Marks updated");
                }
            }

            this.total();
            System.out.print("Date of birth : ");
            this.DOB.display();
            System.out.print("Press 1 to edit, 0 to retain current DOB: ");
            opt = sc.nextInt();
            if (opt == 1) {
                this.DOB.input_date();
                System.out.println("Date of birth updated!");
            } else {
                System.out.println("Retaining old date of birth");
            }

        }

        public void user_input() {
            sc.nextLine();
            System.out.print("\nEnter name : ");
            this.Name = sc.nextLine();
            System.out.print("\nEnter PRN : ");

            for(this.PRN = sc.nextLine(); !this.validatePRN(this.PRN); this.PRN = sc.nextLine()) {
                System.out.println("Invalid PRN! Enter again!");
            }

            this.DOB = new dob();
            this.DOB.input_date();
            this.inputMaxMarks();
            this.input_marks();
            this.total();
        }

        public boolean validatePRN(String PRN) {
            return Pattern.matches("[0-9]+", PRN) && PRN.length() == 11;
        }

        public void input_marks() {
            System.out.println("Enter obtained marks in the subjects : ");

            for(int i = 0; i < this.marks.length; ++i) {
                System.out.println("Enter marks in subject " + (i + 1) + "(out of " + this.max_marks[i] + ") : ");

                do {
                    this.marks[i] = sc.nextInt();
                } while(!this.validateMarks(this.marks[i], i));
            }

        }

        public boolean validateMarks(int m, int i) {
            if (m >= 0 && m <= this.max_marks[i]) {
                return true;
            } else {
                System.out.println("Invalid marks! Enter again in the range 0 to " + this.max_marks[i]);
                return false;
            }
        }

        public void inputMaxMarks() {
            for(int i = 0; i < this.max_marks.length; ++i) {
                System.out.print("\nEnter maximum marks in subject " + (i + 1) + " : ");

                for(this.max_marks[i] = sc.nextInt(); this.max_marks[i] <= 0; this.max_marks[i] = sc.nextInt()) {
                    System.out.print("Invalid marks. Enter again");
                }
            }

        }

        public void display() {
            System.out.println();
            System.out.println();
            System.out.println("Name : " + this.Name);
            System.out.println("PRN : " + this.PRN);
            System.out.println("Date of Birth : ");
            this.DOB.display();
            System.out.println("Marks : ");

            for(int i = 0; i < this.marks.length; ++i) {
                System.out.println("Marks in subject " + (i + 1) + " : " + this.marks[i] + "/" + this.max_marks[i]);
            }

            System.out.println("Total marks : " + this.obt_total + "/" + this.max_total);
            System.out.println("Percentage : " + this.perc);
            System.out.println("Grade : " + this.grade);
            System.out.println();
            System.out.println();
        }

        public void total() {
            for(int i = 0; i < this.max_marks.length; ++i) {
                this.max_total += this.max_marks[i];
                this.obt_total += this.marks[i];
            }

            this.perc = 100.0F * ((float)this.obt_total / (float)this.max_total);
            this.assign_grade();
        }

        public void assign_grade() {
            if (this.perc >= 91.0F) {
                this.grade = "A+";
            } else if (this.perc >= 81.0F) {
                this.grade = "A";
            } else if (this.perc >= 65.0F) {
                this.grade = "B+";
            } else if (this.perc >= 51.0F) {
                this.grade = "B";
            } else if (this.perc >= 40.0F) {
                this.grade = "C";
            } else if (this.perc < 40.0F) {
                this.grade = "F";
            }

        }
    }
