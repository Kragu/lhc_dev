package security.events;

public class RunExperimentPartial {
    private int initialEnergy;

    public int getInitialEnergy() {
        return initialEnergy;
    }

    public void setInitialEnergy(int initialEnergy) {
        this.initialEnergy = initialEnergy;
    }
    public RunExperimentPartial(int initialEnergy){
        this.initialEnergy=initialEnergy;
    }
}
