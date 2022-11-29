package utils;
import storyclasses.Location;
import storyclasses.Mood;
import storyclasses.Sky;
import storyclasses.GlowingBallAbstract;

public class GlowingBall extends GlowingBallAbstract {
    String name;
    boolean moon_is_nearx2;

    public void moon_shape(Person prs) throws Exceptions.ScenarioException {
        boolean well_see;
        well_see = getIsNear();



        class Moon{

            final boolean moon_is_approaching = true;


            public void is_moon_see(){
                if (well_see){
                    System.out.println("Можно рассмотреть:"  + Location.circuses + ' ' +Location.faults + ' ' + Location.mountains);
                }
            }

            public void moonApproaching(Person prs){
                System.out.println(prs + " заметил что Луна не стоит на месте а приближается с заметной скоростью");
                System.out.println("Луна видна как огромный шар величиной с пол неба");
                Time.running_time("несколько");
                System.out.println("Луна заполнила собой все небо");
                moon_is_nearx2 = true;
            }

            public void moon_shape(Person prs) throws Exceptions.ScenarioException {
                try {
                    if (prs.location == Location.moon) {
                        System.out.println(prs.getName() + "ничего не может увидеть кроме " + Location.circuses + ' ' + Location.faults + ' ' + Location.mountains);
                    } else {
                        throw  new Exception();

                    }
                }catch(Exception e){

                    throw new Exceptions.ScenarioException();

                }

            }

        }
        Moon mn = new Moon();
        mn.is_moon_see();
        mn.moonApproaching(prs);
        mn.moon_shape(prs);



    }

    public void checkclosesky(Person prs){
        Sky isclose;
        if (getIsNear()){
            isclose = Sky.CLOSE;
            if (prs.isOpenEyes()) {
                 System.out.println(prs.getName() + " увидел, что небо закрыл " + name);
                 Moods.setMood(prs, Mood.fear);

            }
        } else {
            isclose = Sky.OPEN;
            if (prs.isOpenEyes()) {
                System.out.println(prs.getName() + " увидел, что небо чистое ");
                Moods.setMood(prs, Mood.calm);

            }
        }
    }

    public GlowingBall(boolean isNear, String name) {
        super(isNear);
        this.name = name;
    }


    public void setName(String s){
        this.name = s;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (isNear) {
            return "Здесь находится " + name;
        } else {
            return "Здесь никого нет";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlowingBall) {
            return (name.equals(((GlowingBall) obj).getName()) && isNear == ((GlowingBall) obj).getIsNear());

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (isNear) {
            return name.hashCode() + name.length();
        } else {
            return name.hashCode();
        }
    }


}
