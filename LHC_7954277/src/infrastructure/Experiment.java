package infrastructure;

import humanresources.IROExperiment;

import java.util.ArrayList;
import java.util.UUID;

public class Experiment implements IROExperiment {

    private Block block;
    private ArrayList<Block> list;
    private Experiment() {
        for (int i = 0; i < 200000; i++) {
            block = new Block();
            list.add(block);

        }
    }
    private UUID uuid;
    private String dateTimeStamp;
    private boolean isHiggsBosonFound;

    @Override
    public String readExperimentData(){
        return list.toString();
    }
}
