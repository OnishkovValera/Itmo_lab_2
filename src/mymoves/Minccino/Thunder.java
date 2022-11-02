package mymoves.Minccino;

import Lab2.MyUtils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(double power, double acc){
        super(Type.ELECTRIC, power, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
        if (MyUtils.chance(0.3)) {
            Effect.paralyze(def);
        }
    }


}
