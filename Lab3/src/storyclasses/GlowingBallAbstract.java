package storyclasses;



public abstract class GlowingBallAbstract implements GlowingBallInterface{

    public boolean isNear;

    public GlowingBallAbstract(boolean isNear){
        this.isNear = isNear;
    }

    @Override
    public boolean getIsNear() {
        return isNear;

    }
    public void setNear(){
        isNear = true;
    }
}
