import infrastructure.Building;
import infrastructure.energy.Ring;
import infrastructure.energy.USP;
import lhc.LargeHadronCollider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
int a;
    @BeforeEach
    void setUp() {
        a = 5;
    }

    @AfterEach
    void tearDown() {
    }


    @Order(1)
    @Test
    void test1(){
        LargeHadronCollider lhc = initLHC();
        assertNotNull(lhc.getRing());
        assertNotNull(lhc.getUsp1());
        assertNotNull(lhc.getUsp2());

    }

    @Order(2)
    @Test
    void test2(){
        LargeHadronCollider lhc = initLHC();
        assertEquals(25, lhc.getUsp1().getBatteryList().size());
        assertEquals(25, lhc.getUsp2().getBatteryList().size());
    }

    @Order(3)
    @Test
    void test3(){

    }




    private LargeHadronCollider initLHC(){
        LargeHadronCollider lhc=new LargeHadronCollider();
        Building building=new Building();
        Ring ring=new Ring();
        USP usp1=new USP();
        USP usp2=new USP();
        lhc.setBuilding(building);
        lhc.setRing(ring);
        lhc.setUsp1(usp1);
        lhc.setUsp2(usp2);
        return lhc;
    }




}