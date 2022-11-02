package mypokemons;

import mymoves.Minccino.CalmMind;
import mymoves.Minccino.DoubleTeam;
import mymoves.Minccino.Tickle;
import mymoves.Tynamo.ChargeBeam;
import mymoves.Tynamo.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tynamo extends Pokemon {
    public Tynamo(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(35,53,40,45,40,60);
        ChargeBeam hrgb = new ChargeBeam(50, 90);
        ThunderWave thndw = new ThunderWave(90);


        super.setMove(hrgb, thndw);
    }
}

