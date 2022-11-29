package utils;
import storyclasses.Location;
import storyclasses.Mood;
import storyclasses.PersonInterface;
import storyclasses.Thermostat;
import storyclasses.BodyPositions;
public class Person implements PersonInterface {
    public BodyPositions bodyPositions;
    public Mood mood;

    private final String name;

    public Location location;
    private boolean isOpenEyes;

    private boolean isSleeping;

    public Person(String name){
        this.name = name;
        isOpenEyes = true;
        mood = Mood.calm;
        this.isSleeping = false;
    }

    public Person(String name, boolean isOpenEyes){
        this.name = name;
        mood = Mood.calm;
        this.isSleeping = false;
        this.isOpenEyes = isOpenEyes;
    }

    public Person(String name, boolean isOpenEyes ,boolean isSleeping){
        this.name = name;
        this.isOpenEyes = isOpenEyes;
        this.isSleeping = isSleeping;
        mood = Mood.calm;

    }
    public void person_say(String s){
        System.out.println(this.name + " сказал " + s);
    }

    public void setBodyPositions(BodyPositions bodyPositions){
        this.bodyPositions = bodyPositions;
        System.out.println(name + " принял позицию " + bodyPositions);
    }

    public void look_at(String s){
        System.out.println("Смотрит на " + s);
    }
    @Override
    public boolean isOpenEyes() {
        return isOpenEyes;
    }


    @Override
    public boolean isSleeping() {
        return isSleeping;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void move(Location lc) {
        location = lc;
        System.out.println(name + " переместились в " + lc);
    }

    public void setSleeping(boolean b){
        if (b & !isSleeping){
            isOpenEyes = false;
            System.out.println(name + " уснул");
        }
        isSleeping = b;
    }

    public void wakeUp(Person prs){
        prs.isOpenEyes = true;
        prs.isSleeping = false;
        System.out.println(name + " тормошит " + prs.getName());
        System.out.println(prs.getName() + " проснулся и увидел " + name);
    }

    public static void checkMood(GlowingBall gwb, Person prs) {
        if (gwb.isNear) {
            System.out.println(prs.getName() + " увидел " + gwb.getName());
            Moods.setMood(prs , Mood.fear);
        }
    }
    public void take_something(Thermostat tr){
        System.out.println(name + " взял из термостата" + tr);
    }



    @Override
    public String toString() {
        if (isSleeping()) {
            return "Ветренная погода '" + name + "'";
        } else {
            return "Погода '" + name + "'";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            return (name.equals(((Person) obj).getName()) && isSleeping() == ((Person) obj).isSleeping());

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (isSleeping()) {
            return name.hashCode() + name.length();
        } else {
            return name.hashCode();
        }
    }


}
