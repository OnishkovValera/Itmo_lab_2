package utils;
import java.io.File;
import java.util.Scanner;
import storyclasses.Mood;
import storyclasses.EngineInterface;
import utils.Person;
import utils.Moods;
public class Engine implements EngineInterface {
    String name;
    boolean is_working;

    public void Engine(){
    }

    public void Engine(String name){
        this.name = name;
        this.is_working = false;
    }

    public void Engine(String name, boolean iw){
        this.name = name;
        this.is_working = iw;
    }


    @Override
    public void engine_sound(Person prs) {
        try{
            System.out.println("Двигетель " + name + " Издает звуки Чаф-чафчаф-Чаф");
            if (prs.mood == Mood.listened) {
                prs.setSleeping(true);
            }
        } catch (NullPointerException e ){
            Scanner scn = new Scanner(System.in);
            this.name = scn.nextLine();
            throw new Exceptions.ExistException("У двигателя нет серийного номера");
        }
    }


    @Override
    public String getName() {
        return name;
    }
}
