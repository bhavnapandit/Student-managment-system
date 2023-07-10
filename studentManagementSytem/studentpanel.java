package studentManagementSytem;
import static studentManagementSytem.studentInfo.*;

import java.util.Scanner;

public class studentpanel {
    static Scanner sc=new Scanner(System.in);

    static subject[] marks = new subject[5];
static subject[] addSubject(){
		for (int i = 0; i < marks.length; i++) {
		System.out.println("Enter the mark");
		int mark=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter  subject marks you want to add:");
		String sub=sc.nextLine();
		
         marks[i]=new subject(sub, mark);
		}
		System.out.println("your subject marks has be added sucessfully");
		return marks;
	}

    public static void assignMarkToStudent() {
        System.out.println("Enter student Id:");
        int sid=sc.nextInt();
        for (int i = 0; i < studentCount; i++) {
            if(sid==students[i].getId()){
            students[i].setMarks(marks);
            marks=addSubject();
            }
            else{
                continue;
            }
        }
    }

public static void showMarks() {
        System.out.println("Enter student Id:");
        int sid=sc.nextInt();
        int total_marks=0;
        int avg_marks=0;
        for (int i = 0; i < studentCount; i++) {
            if(sid==students[i].getId()){
                
                subject[] temp_mark=students[i].getMarks();
                for (int j = 0; j < temp_mark.length; j++) {
                   System.out.println(temp_mark[j]);
                }
            }
        }
    }
   
    public static void calculateAvg() {
        System.out.println("Enter student Id:");
        int sid=sc.nextInt();
        int total_marks=0;
        int avg_marks=0;
        for (int i = 0; i < studentCount; i++) {
            if(sid==students[i].getId()){
                
                int [] mark=new int[6];
                subject[] temp_mark=students[i].getMarks();
                for (int j = 0; j <students[i].getMarks().length ; j++) {
                    mark[j]=temp_mark[j].getMark();
                }
                for (int j = 0; j <6; j++) {
                  total_marks+=mark[j];
                }
            }
        }
        avg_marks=total_marks/6;
        System.out.println("Aevrage of your marks : "+avg_marks);
    }
}
