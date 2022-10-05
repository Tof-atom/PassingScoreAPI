package ca.vanier;

public class ScoreManager {

    public ScoreManager() {
    };

    public boolean Check(int score) {
        if (score > 6)
            return true;
        else
            return false;
    }
}
