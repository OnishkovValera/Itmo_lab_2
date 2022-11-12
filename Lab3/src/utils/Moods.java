package utils;

import storyclasses.GlowingBallAbstract;
import storyclasses.Mood;

public abstract class Moods extends GlowingBallAbstract {




    public static void setMood(Person prs, Mood mood) {
        prs.mood = mood;
        System.out.println("Настроение " + prs.getName() + " поменялось на " + getMood(prs));
    }


    public static Mood getMood(Person prs) {
        return prs.mood;
    }
}
