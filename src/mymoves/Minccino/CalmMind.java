package mymoves.Minccino;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {

    public CalmMind(){
        super(Type.PSYCHIC, 0, 0);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect calmmind = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
        pokemon.addEffect(calmmind);
        System.out.println(pokemon.toString() + " attack +2");
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
