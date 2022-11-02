package mymoves.Tynamo;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double power, double acc) {
        super(Type.ELECTRIC, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect chargeBeam = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1);
        pokemon.addEffect(chargeBeam);
        System.out.println(pokemon.toString() + "Special_attack +2");

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];

    }
}