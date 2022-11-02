package mymoves.Latias;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(double power, double acc){
        super(Type.PSYCHIC, power, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

        Effect psychic = new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_DEFENSE, -1);

        def.addEffect(psychic);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
