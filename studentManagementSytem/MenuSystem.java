package studentManagementSytem;

import java.util.Scanner;

public class MenuSystem {
    public static void allStudents() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Press 1. Student Area\n"
                    + "press 2. Management Area\n"
                    + "press 3. To quit");
            System.out.println("----x----x----");
            System.out.println("Enter your choice!!");
            System.out.println("----x----x----");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StudentArea.studentOperations();
                    break;
                case 2:
                    ManagementArea.ManagementOperation();
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("~~~Student Mangement System~~~");
        allStudents();
    }
}
