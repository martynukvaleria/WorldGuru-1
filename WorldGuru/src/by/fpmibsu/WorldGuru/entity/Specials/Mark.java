package by.fpmibsu.WorldGuru.entity.Specials;

public class Mark {
    double mark;
    double maxScore;

    Mark (int maxScore){
        this.mark = 0;
        this.maxScore = maxScore;
    }

    void increaseMark(){
        if (this.mark < this.maxScore){
            this.mark++;
        }
    }
}
