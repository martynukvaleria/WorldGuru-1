package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class CompareFactsQuiz extends ModePrototype{
    String question1;
    String question2;
    String question3;
    String question4;
    String answer1;
    String answer2;
    String answer3;
    String answer4;

    CompareFactsQuiz(String question1, String question2, String question3, String question4,
                     String answer1, String answer2, String answer3, String answer4){
        this.question1 = question1;
        this.answer1 = answer1;
        this.question2 = question2;
        this.answer2 = answer2;
        this.question3 = question3;
        this.answer3 = answer3;
        this.question4 = question4;
        this.answer4 = answer4;
        this.nameOfRegime = "CompareFactsQuiz";
    }

}
