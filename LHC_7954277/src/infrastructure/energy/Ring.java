package infrastructure.energy;

import infrastructure.Experiment;
import lhc.Proton;
import lhc.ProtonTrap;
import lhc.ProtonTrapID;
import security.events.Subscriber;

public class Ring extends Subscriber {
    private boolean isActivated;
    private int energy;
    private Experiment currentExperiment;
    private Magnet magnet;
    ProtonTrap protonTrap01;
    ProtonTrap protonTrap02;

    public Ring(){
        protonTrap01=new ProtonTrap(ProtonTrapID.A);
        protonTrap02=new ProtonTrap(ProtonTrapID.B);
        magnet = new Magnet();

    }

    public void active(InitialEnergy initialEnergy){
        isActivated=true;
        switch (initialEnergy){
            case INITIAL_ENERGY25:
                energy=25000;
                break;
            case INITIAL_ENERGY50:
                energy=50000;
                break;
            case INITIAL_ENERGY100:
                energy=100000;
                break;
            default:
                break;
        }
        magnet.active();
    }
    public void receive(){
        
    }
    public void active(int initialEnergy){


    }
    public void activateMagneticField(){


    }
    public void releaseProton(){


    }
    public void invreaseEnergy(int delta){


    }
    public void collide(Proton proton01, Proton proton02){

    }
    public int decreaseEnergy(){

        return 1;
    }
    public void shutdown(){

    }
}
