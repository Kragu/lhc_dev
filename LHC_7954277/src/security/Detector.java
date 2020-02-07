package security;

import humanresources.IRODetector;
import humanresources.IROExperiment;
import infrastructure.energy.Ring;
import security.events.Subscriber;

import java.io.Reader;
import java.util.LinkedList;

public class Detector extends Subscriber implements IRODetector {
    private Ring ring;

    private String higgsBosonStructure ="higgs";
    private boolean isActive;
    private LinkedList experimentList;
    private Reader reader;
    private IROExperiment iroExperiment;


    @Override
    public void viewData() {
        iroExperiment.readExperimentData();
    }
}