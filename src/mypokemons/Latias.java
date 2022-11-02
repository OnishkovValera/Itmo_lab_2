package mypokemons;

import mymoves.Latias.AerialAce;
import mymoves.Latias.EnergyBall;
import mymoves.Latias.MistBall;
import mymoves.Latias.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Latias extends Pokemon {
    public Latias(String name, int level){
        super(name, level);
        super.setType(Type.DRAGON, Type.PSYCHIC);
        super.setStats(80, 80, 90, 110, 130, 110);
        double inf = Double.POSITIVE_INFINITY;
        EnergyBall enb = new EnergyBall(90, 100);
        MistBall mstb = new MistBall(70, 100);
        Psychic psch = new Psychic(90, 100);
        AerialAce arla = new AerialAce(60, inf);
        super.setMove(enb, mstb, psch);
    }
}
