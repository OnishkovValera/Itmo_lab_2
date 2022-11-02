package mypokemons;

import mymoves.Tynamo.Spark;
import ru.ifmo.se.pokemon.Type;

public class Eelektrik extends Tynamo{
    public Eelektrik(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(65, 85, 70,75,70,40);
        Spark sprk = new Spark(65, 100);
        super.setMove(sprk);
    }

}
