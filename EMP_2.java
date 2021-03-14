package Employee;

import Employee.EMP_1;
public class EMP_2 implements Comparable<EMP_2> {
        private static int count = 0;
        {
            count++;
        }

        public int id, salary;
        public String name, gender, jobTitle, organization;

        public EMP_2() {
            this.id = 691691;
            this.salary = 69191;
            this.name = "Test";
            this.gender = "M";
            this.jobTitle = "Lorem";
            this.organization = "Ipsum";
        }

        public EMP_2(int id, int salary, String name, String gender, String jobTitle, String organization) {
            this.id = id;
            this.salary = salary;
            this.name = name;
            this.gender = gender;
            this.jobTitle = jobTitle;
            this.organization = organization;
        }

        public int getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(EMP_2 o) {
            int compare = (this.name).compareTo(o.getName());
            if (compare == 0)
                compare = Integer.compare(this.id, o.getId());
            return compare;
        }

        @Override
        public String toString() {
            return String.format("ID: %1$4d\tSalary: %2$8d\tName: %3$10s\tGender: %4$1s\tJob Title: %5$10s\tOrganization: %6$10s", id, salary, name, gender, jobTitle, organization);
        }
    }
