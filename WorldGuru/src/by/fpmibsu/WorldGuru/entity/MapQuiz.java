package by.fpmibsu.WorldGuru.entity;
import java.awt.*;

public class MapQuiz extends ModePrototype {
    Image countryShape;
    String inputTxt;
    String clueFact;
    String cluePopulation;
    String clueContinent;

    MapQuiz(Image countryShape, String inputTxt, String clueFact, String cluePopulation, String clueContinent){
        this.countryShape = countryShape;
        this.inputTxt = inputTxt;
        this.clueFact = clueFact;
        this.cluePopulation = cluePopulation;
        this.clueContinent = clueContinent;
        this.nameOfRegime = "MAP QUIZ";
    }
}
