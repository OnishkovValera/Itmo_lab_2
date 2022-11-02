package Lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;



public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Cinccino pok1 = new Cinccino("Мыслант", 1 );
        Minccino pok2 = new Minccino("Мыслат2", 1 );
        Latias pok3 = new Latias("Крутой_Мыслант", 1);

        Tynamo pok4 = new Tynamo("Микроволновка", 1);
        Eelektrik pok5 = new Eelektrik("Индукционная_плита", 1);
        Eelektross pok6 = new Eelektross("Трансформатор",1);

        b.addAlly(pok1);
        b.addAlly(pok2);
        b.addAlly(pok3);

        b.addFoe(pok4);
        b.addFoe(pok5);
        b.addFoe(pok6);
        b.go();
    }

}