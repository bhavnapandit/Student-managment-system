package studentManagementSytem;

import java.util.Arrays;
import java.util.Scanner;

public class studentInfo {

    static final int MAX_STUDENTS = 100;
    static int studentCount = 0; // Number of students currently stored

    static Student[] students = new Student[MAX_STUDENTS];

    static Scanner sc = new Scanner(System.in);

    static void addStudentProfile(Student student) {
        students[studentCount++] = student;
        System.out.println("Students profile is sucessfully added!!!");
    }

    static void serachStudentProfile() {
        System.out.println("Enter the student ID:");
        int id = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                check = true;
                System.out.println("Student record you were looking for:");
                System.out.println("----x----x----");
                System.out.println("Student name:" + students[i].getName());
                System.out.println("Student Id:" + students[i].getId());
                System.out.println("Student age:" + students[i].getAge());
                System.out.println("Student grade:" + students[i].getGrade());
                for (int j = 0; j < students[i].getMarks().length; j++) {
                    subject[] m = students[i].getMarks();
                    if (m[j] == null) {
                        continue;
                    } else {
                        System.out.println("Subject name:" + m[j].getSubject_name());
                        System.out.println("Subject marks:" + m[j].getMark());

                        System.out.println("----x----x----");
                    }
                }
                break;
            }
        }
        if (check == false) {
            System.out.println("Student is not registered yet in the system");
        }
    }

    public static void modifyStudentInfo() {
        System.out.println("Enter the student ID:");
        int id = sc.nextInt();

    }

    public static void sortStudentByName() {

    }

    public static void deactivateStudentprofile() {
        sc.nextLine();
        System.out.println("Enter the  name of the Student you want to delete from the list");
        String name = sc.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getName().equals(name)) {
                students[i] = students[i + 1];
                studentCount--;
                break;
            }

            if (i == students.length - 1) {
                System.out.println("That requested person is not admitted  at this school.");
            }
        }
    }

    public static void displayStudentProfile() {
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("----x----x----");
            System.out.println("Student name:" + students[i].getName());
            System.out.println("Student Id:" + students[i].getId());
            System.out.println("Student age:" + students[i].getAge());
            System.out.println("Student grade:" + students[i].getGrade());
            for (int j = 0; j < students[i].getMarks().length; j++) {
                subject[] m = students[i].getMarks();
                if (m[j] == null) {
                    continue;
                } else {
                    System.out.println("Subject name:" + m[j].getSubject_name());
                    System.out.println("Subject marks:" + m[j].getMark());

                    System.out.println("----x----x----");
                }
            }
            System.out.println("----x----x----");
        }
    }
}
