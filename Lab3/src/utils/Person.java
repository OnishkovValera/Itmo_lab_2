package utils;

import storyclasses.Mood;
import storyclasses.PersonInterface;
public class Person implements PersonInterface {

    public Mood mood;

    private String name;

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
    public void move(String room) {
        System.out.println(name + " переместились в " + room);
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
