package mypokemons;

import mymoves.Tynamo.Discharge;
import mymoves.Tynamo.Spark;
import ru.ifmo.se.pokemon.Type;

public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(85, 115, 80,105,80,50);
        Discharge dsch = new Discharge(80,100);
        super.setMove(dsch);
    }
}
