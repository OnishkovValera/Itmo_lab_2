package utils;

import storyclasses.GlowingBallAbstract;

public class GlowingBall extends GlowingBallAbstract {
    String name;

    public GlowingBall(boolean isNear, String name) {
        super(isNear);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (isNear) {
            return "Здесь находится " + name;
        } else {
            return "Здесь никого нет";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlowingBall) {
            return (name.equals(((GlowingBall) obj).getName()) && isNear == ((GlowingBall) obj).getIsNear());

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (isNear) {
            return name.hashCode() + name.length();
        } else {
            return name.hashCode();
        }


    }
}
