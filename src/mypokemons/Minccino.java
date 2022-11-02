package mypokemons;
import java.lang.Math;
import mymoves.Minccino.CalmMind;
import mymoves.Minccino.DoubleTeam;
import mymoves.Minccino.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Minccino extends Pokemon {
    public Minccino(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(55,50,40,40,40,75);
        CalmMind clm = new CalmMind();
        Tickle tckl = new Tickle(100);
        DoubleTeam dbt = new DoubleTeam();

        super.setMove(clm, tckl, dbt);
    }

}
