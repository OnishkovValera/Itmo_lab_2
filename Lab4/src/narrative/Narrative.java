package narrative;
import storyclasses.*;
import utils.*;

public class Narrative {
    public static void main(String[] args) throws Exceptions.ScenarioException {
        try {
            Person p1 = new Person("Незнайка", true, false);
            Person p2 = new Person("Пончик", true, false);
            Engine e1 = new Engine();
            Moods.setMood(p1, Mood.calm);
            Moods.setMood(p2, Mood.eating);
            Time.running_time("2");
            p1.look_at("Луну");
            Moods.setMood(p1, Mood.hungry);
            Locations.setLocation(p1, Location.food_department);
            p1.look_at(p2.getName());
            p2.take_something(Thermostat.soup);
            p2.take_something(Thermostat.cabbage_rolls);
            p2.take_something(Thermostat.kissel);
            Moods.setMood(p2, Mood.eating);
            Moods.setMood(p1, Mood.calm);
            Moods.setMood(p2, Mood.calm);
            p2.person_say("для правильного пищеварения после обеда пологается поспать");
            p2.setBodyPositions(BodyPositions.flattened_out);
            p2.setSleeping(true);
            p1.setBodyPositions(BodyPositions.sits);
            p1.setSleeping(true);
            TryToSleep sleep = new TryToSleep() {
                @Override
                public void try_to_sleep(Person prs) {
                    if (prs.isOpenEyes()) {
                        System.out.println(prs.getName() + " попытался уснуть");
                    }
                }
            };

            sleep.try_to_sleep(p1);
            e1.engine_sound(p1);
            p1.setSleeping(true);
            Time.running_time("несоклько");
            p2.wakeUp(p1);
            p1.move(Location.astronomy_cabin);
            p2.move(Location.astronomy_cabin);
            GlowingBall gwb = new GlowingBall(true, "Светящийся шар");
            gwb.checkclosesky(p1);
            gwb.checkclosesky(p2);
            gwb.setName("Луна");
            p1.move(Location.astronomical_cabin_ceiling);
            p1.look_at("Поверхность луны");
            gwb.moon_shape(p1);
            p2.move(Location.astronomical_cabin_ceiling);
            Moods.setMood(p1, Mood.fear);
            Moods.setMood(p1, Mood.fear);


        } catch (Exception e){
            System.err.println("что то пошло не так: " + e.getMessage());
            throw new Exceptions.ScenarioException();
        } finally {
            System.out.println("конец");
        }
    }
}
