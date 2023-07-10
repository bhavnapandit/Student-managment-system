package studentManagementSytem;

import java.util.Scanner;
import static studentManagementSytem.studentInfo.*;
public class ManagementArea {
    static Scanner sc=new Scanner(System.in);
    static Student createStudentProfile(){
		
        System.out.println("Enter Student id:");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Student age:");
		int age=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student grade:");
		String grade=sc.nextLine();
		
        return new Student(id,name,age,grade);
    }

     static void ManagementOperation() {
        int choice;
		while(true) {
		System.out.println("Press 1. Add Student profile\n"
		+"Press 2. Deactivate Student profile\nPress 3. Display student information\n"
				+"Press 4. Search student information\n"
				+"Press 5. Add quiz \n"
				+"Press 6. Display quiz\n"
				+"Press 7. Assign marks to student profile\n"
				+"Press 8. Go back to the menu system\n"
				);
		
		System.out.println("----x----x----");
		System.out.println("Enter your choice!!");
		System.out.println("----x----x----");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
            Student s=createStudentProfile();
            studentInfo.addStudentProfile(s);
			break;
		case 2:
		    studentInfo.deactivateStudentprofile();
			break;
		case 3:
            studentInfo.displayStudentProfile();
			break;
		case 4:
			studentInfo.serachStudentProfile();
			break;
		case 5:
		    quizMode.createQuiz();
		    break;
		case 6:
		    quizMode.showQuiz();
			break;
		case 7:
            studentpanel.assignMarkToStudent();
			break;
		case 8:
		MenuSystem.allStudents();
		 break;
		
		}
		}
        
    }
}
