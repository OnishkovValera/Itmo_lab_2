package mymoves.Tynamo;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import javax.sql.PooledConnection;

public class ThunderWave extends StatusMove {
    public ThunderWave(double acc) {
        super(Type.ELECTRIC, 0, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.paralyze(pokemon);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}