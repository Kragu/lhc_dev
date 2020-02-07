package infrastructure.energy;

import infrastructure.ThreePinPlug;

import java.util.ArrayList;

public class USP {
    private boolean isStandby;
    private boolean isActivated;
    private ArrayList<Battery> batteryList;
    public void determineChargeState(){


    }
    public void charge(ThreePinPlug plug){


    }
    public int takeOut(){

        return 1;
    }

    public ArrayList<Battery> getBatteryList() {
        return batteryList;
    }

    public USP(){
        this.batteryList=new ArrayList<>();
        for(int i=0;i<25;i++){
            this.batteryList.add(new Battery());
        }
    }
    //new
}
