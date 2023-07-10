package studentManagementSytem;

import java.util.*;

public class quizMode {
    static Scanner sc = new Scanner(System.in);

    static Quiz[] quizs = new Quiz[7];


    public static void createQuiz() {
        for (int i = 0; i < quizs.length; i++) {
            int min = 1;
            int max = 10;
            int a = (int)(Math.random()*(max-min+1)+min);  
            int b = (int)(Math.random()*(max-min+1)+min);  
            int ans=a+b;
            
            quizs[i] = new Quiz("Solve this sum:"+a+"+"+b+"?", ans);
        }
        
        
    }

    public static void showQuiz() {
        System.out.println("~~~Welcome to the Maths Quiz round~~~");

        for (int i = 0; i < quizs.length; i++) {
            System.out.println(quizs[i].getQuestion());
            System.out.println(quizs[i].getCorrectAnswer());
        }
    }

    public static void takeQuiz() {
        System.out.println("~~~Welcome to the Maths Quiz round~~~");
        int marks = 0;
        int i = 0;
        while (i < quizs.length) {
           
            System.out.println(quizs[i].getQuestion());

            System.out.println("Enter the answer  to above question:");
            int ans = sc.nextInt();
            if (ans == quizs[i].getCorrectAnswer()) {
                System.out.println("Correct answer!!!!");
                marks++;
            } else {
                System.out.println("oppps!! wrong answer");
            }
            i++;
        }
        if (marks == 7) {
            System.out.println("wow brilliant score:" + marks);
        } else {
            System.out.println("you can definitily improve:" + marks);
        }

    }
}
