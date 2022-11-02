package mymoves.Latias;

import ru.ifmo.se.pokemon.*;

public class MistBall extends SpecialMove {
    public MistBall(double power, double acc){
        super(Type.PSYCHIC, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

        Effect mistBall = new Effect().chance(0.5).turns(1).stat(Stat.SPECIAL_ATTACK, -1);

        def.addEffect(mistBall);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
