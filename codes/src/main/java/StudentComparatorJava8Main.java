package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparatorJava8Main {

    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student("Sally", "Kuhlman", "502-48-7642"),
                new Student("Werner", "Fadel", "540-80-0220"),
                new Student("Cordell", "Rath", "577-52-4214"),
                new Student("Ciara", "DuBuque", "401-96-6447"),
                new Student("Hollie", "Gerhold", "041-14-4719"),
                new Student("Luz", "Witting", "503-22-5769"),
                new Student("Werner", "Fadel", "575-50-7164"),
                new Student("Luz", "DuBuque", "646-10-6605")
        );
        students = students.stream().sorted(Student::compareTo).collect(Collectors.toList());
        System.out.println(students);
    }

    public static class Student implements Comparable<Student>{
        private String firstName;
        private String lastName;
        private String ssn;

        public Student(String firstName, String lastName, String ssn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ssn = ssn;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSsn() {
            return ssn;
        }

        @Override
        public int compareTo(Student that) {
            int comparedFirstName = this.firstName.compareTo(that.getFirstName());
            int comparedlastName = this.lastName.compareTo(that.getLastName());

            return comparedFirstName == 0 ?
                    (
                            comparedlastName == 0 ?
                                    this.ssn.compareTo(that.getSsn()) :
                                    comparedlastName
                    ) :
                    comparedFirstName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", ssn='" + ssn + '\'' +
                    '}' + "\n";
        }
    }
}
