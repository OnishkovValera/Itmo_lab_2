package mymoves.Minccino;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect doubleteam = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(doubleteam);
        System.out.println(pokemon.toString() + " evasion +2");
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
