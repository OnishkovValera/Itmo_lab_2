package mymoves.Minccino;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {
    public Tickle(double acc){
        super(Type.NORMAL, 0, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        Effect tickle = new Effect().stat(Stat.ATTACK, -1).stat(Stat.DEFENSE, -1);
        def.addEffect(tickle);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
