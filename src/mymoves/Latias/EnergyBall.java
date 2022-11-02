package mymoves.Latias;


import Lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {

    public EnergyBall(double power, double acc) {
        super(Type.GRASS, power, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

        Effect energyBall = new Effect().chance(0.1).turns(1).stat(Stat.SPECIAL_ATTACK, -1);

        def.addEffect(energyBall);
        }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    }


