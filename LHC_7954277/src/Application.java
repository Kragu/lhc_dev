import infrastructure.Building;
import infrastructure.energy.Ring;
import infrastructure.energy.USP;
import lhc.LargeHadronCollider;
import lhc.ProtonTrap;
import lhc.ProtonTrapID;

public class Application {
    public static void main(String[] args) {

        //TEST_01
        LargeHadronCollider lhc=new LargeHadronCollider();
        Building building=new Building();
        Ring ring=new Ring();
        USP usp1=new USP();
        USP usp2=new USP();
        lhc.setBuilding(building);
        lhc.setRing(ring);
        lhc.setUsp1(usp1);
        lhc.setUsp2(usp2);
        if(lhc.getBuilding()!= null)
            System.out.println("lhc hat ein zugeordnetes Gebaeude");
        if(lhc.getRing()!= null)
            System.out.println("lhc hat ein zugeordnetes Ring");
        if(lhc.getUsp1()!= null)
            System.out.println("lhc hat ein zugeordnetes USP");
        if(lhc.getUsp2()!= null&&(lhc.getUsp2()!=lhc.getUsp1()))
            System.out.println("lhc hat noch ein zugeordnetes Gebaeude");
        //TEST_01


    }
}
