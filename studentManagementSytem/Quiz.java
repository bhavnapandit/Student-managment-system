package studentManagementSytem;

import java.util.Arrays;

public class Quiz {
    private String question;
    private int correctAnswer;

    
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    
    public Quiz(String question, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
    @Override
    public String toString() {
        return "quiz [question=" + question +", correctAnswer="
                + correctAnswer + "]";
    }
    
    
}
