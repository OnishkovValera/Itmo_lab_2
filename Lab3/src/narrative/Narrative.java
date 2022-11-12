package narrative;

import utils.GlowingBall;
import utils.Person;

public class Narrative {
    public static void main(String[] args){
        Person p1 = new Person("Незнайка",false, true);
        Person p2 = new Person("Пончик");
        p2.wakeUp(p1);
        p1.move("астрономическая кабина");
        p2.move("астрономическая кабина");
        GlowingBall gwb = new GlowingBall(true, "Светящийся шар");
        Person.checkMood(gwb, p1);
        Person.checkMood(gwb, p2);
    }
}
