package lhc;

import infrastructure.Building;
import infrastructure.energy.Ring;
import infrastructure.energy.USP;

public class LargeHadronCollider {
    private Building building;
    private Ring ring;
    private USP usp1;
    private USP usp2;

    public void setBuilding(Building building) {
        this.building = building;
    }


    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public void setUsp1(USP usp1) {
        this.usp1 = usp1;
    }

    public void setUsp2(USP usp2) {
        this.usp2 = usp2;
    }

    public Building getBuilding() {
        return building;
    }

    public Ring getRing() {
        return ring;
    }

    public USP getUsp1() {
        return usp1;
    }

    public USP getUsp2() {
        return usp2;
    }
}
