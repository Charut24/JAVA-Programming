package Student_information;

import java.time.Year;
import java.util.Scanner;

class dob {
        int date;
        int month;
        int year;
        static Scanner sc;

        static {
            sc = new Scanner(System.in);
        }

        public dob() {
        }

        public dob(int date, int month, int year) {
            if (this.validateDate(date, month, year)) {
                this.date = date;
                this.month = month;
                this.year = year;
            } else {
                throw new IllegalArgumentException("Invalid Date/Month/Year passed!");
            }
        }

        public boolean validateMonth(int month) {
            return month >= 1 && month <= 12;
        }

        public boolean validateYear(int year) {
            return year >= 1900 && year <= Year.now().getValue();
        }

        public boolean validateDate(int date, int month, int year) {
            if (this.validateYear(year) && this.validateMonth(month)) {
                switch(month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (date >= 1 && date <= 31) {
                            return true;
                        }

                        return false;
                    case 2:
                        if (this.isLeapYear(year)) {
                            if (date >= 1 && date <= 29) {
                                return true;
                            }

                            return false;
                        }

                        if (date >= 1 && date <= 28) {
                            return true;
                        }

                        return false;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (date >= 1 && date <= 30) {
                            return true;
                        }

                        return false;
                }
            }

            return false;
        }

        public boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0) {
                    return year % 100 != 0 || year % 400 == 0;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public void display() {
            System.out.println(this.date + "/" + this.month + "/" + this.year);
        }

        public void input_date() {
            do {
                System.out.println("\nEnter a valid date of birth : ");
                System.out.print("Enter date : ");
                this.date = sc.nextInt();
                System.out.println("Enter month : ");
                this.month = sc.nextInt();
                System.out.println("Enter year : ");
                this.year = sc.nextInt();
            } while(!this.validateDate(this.date, this.month, this.year));

        }

        public static void exit() {
            System.out.println("Exiting DOB");
            sc.close();
        }
    }
