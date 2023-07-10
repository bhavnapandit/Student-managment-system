package studentManagementSytem;

import java.util.Scanner;
import static studentManagementSytem.studentpanel.*;
public class StudentArea {
	 
	
    static Scanner sc=new Scanner(System.in);
	
	

    static void studentOperations(){
         int choice;
		while(true) {
		System.out.println("Press 1. View Your profile\nPress 2.Calculate your average mark\n"
		+"Press 3.CHeck marks\n"
		+"press 4 To take quiz\n"
		+"Press 5.Return to MainMenu \n"
				);
		
		System.out.println("----x----x----");
		System.out.println("Enter your choice!!");
		System.out.println("----x----x----");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
            studentInfo.serachStudentProfile();
			break;
		case 2:
		    studentpanel.calculateAvg();
			break;
		case 3:
           studentpanel.showMarks();
		   break;
		case 4:
            quizMode.takeQuiz();
			break;
		case 5:
		   MenuSystem.allStudents();
		 break;
		
		}
		}
        
    }
    }

