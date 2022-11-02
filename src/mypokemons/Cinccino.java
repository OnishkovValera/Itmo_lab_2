package mypokemons;

import mymoves.Minccino.Thunder;
import ru.ifmo.se.pokemon.Type;

public class Cinccino extends Minccino{
    public Cinccino(String name, int level) {
        super(name, level);

        setStats(75,95,60,65,60,115);
        setType(Type.NORMAL);
        Thunder thnd = new Thunder(110, 70);
        addMove(thnd);
    }
}
