package by.fpmibsu.WorldGuru.entity;

import by.fpmibsu.WorldGuru.entity.Specials.Mark;
import by.fpmibsu.WorldGuru.entity.Specials.Time;

public class UserPrototype extends VisitorPrototype {
    int ID;
    String password;
    Time flagsHighScore;
    Time quizHighScore;
    Time MapHighScore;
    Time completeConnectionHighScore;
    Mark mark;
}
