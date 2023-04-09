package by.fpmibsu.WorldGuru.entity;

import java.awt.*;

public class FlagQuiz extends ModePrototype{
    Image flagImage;

    String variant1;
    String variant2;
    String variant3;
    String variant4;

    FlagQuiz(Image flagImage, String variant1, String variant2, String variant3, String variant4){
        this.flagImage = flagImage;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.nameOfRegime = "FLAG QUIZ";
    }

}
