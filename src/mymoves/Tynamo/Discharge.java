package mymoves.Tynamo;

import Lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge(double power, double acc){
        super(Type.ELECTRIC, power, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        if( MyUtils.chance(0.3)){
            Effect.paralyze(def);
        }

    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
