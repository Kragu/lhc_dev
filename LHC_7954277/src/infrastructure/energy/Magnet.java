package infrastructure.energy;

public class Magnet {
    private boolean isActivated;
    private MagneticDirection direction;
    private  int fieldStrength;

    public void active(){
        this.isActivated=true;
    }

    public void deactivate(){
        this.isActivated=false;
    }
}
