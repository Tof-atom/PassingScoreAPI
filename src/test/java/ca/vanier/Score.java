package ca.vanier;

import org.junit.Assert;
import org.junit.Test;

public class Score {

    @Test
    public void Test() {
        int score = 7;

        ScoreManager sc = new ScoreManager();

        boolean cond = sc.Check(score);

        Assert.assertTrue(cond);
    }
}
