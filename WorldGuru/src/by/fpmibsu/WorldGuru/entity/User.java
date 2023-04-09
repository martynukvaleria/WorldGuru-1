package by.fpmibsu.WorldGuru.entity;

import java.sql.Time;

public class User extends VisitorPrototype {
    int ID;
    String password;
    Time flagsHighScore;
    Time quizHighScore;
    Time mapHighScore;
    double flagsPercent;
    double quizPercent;
    double mapPercent;
    double userMark;
    boolean isAdmin;
    User(int ID, String nickname, String password, Time flagsHighScore, Time quizHighScore, Time mapHighScore,
         int flagPassed, int mapPassed, int quizPassed,
         int flagFailed, int mapFailed, int quizFailed,
         double userMark, boolean isAdmin){
        this.ID = ID;
        this.nickname = nickname;
        this.password = password;
        this.flagsHighScore = flagsHighScore;
        this.mapHighScore = mapHighScore;
        this.quizHighScore = quizHighScore;
        this.flagsPercent = (double) (flagPassed / (flagPassed + flagFailed));
        this.quizPercent = (double) (quizPassed / (quizPassed + quizFailed));
        this.mapPercent = (double) (mapPassed / (mapFailed + mapPassed));
        if (isAdmin) {
            this.userMark = 10;
            this.isAdmin = true;
        } else {
            this.userMark = userMark;
            this.isAdmin = false;
        }

    }
}
