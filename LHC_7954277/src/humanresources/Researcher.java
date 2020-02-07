package humanresources;

public class Researcher extends Employee {

    private ResearchGroup researchGroup;
    private boolean isSenior;
    private IRODetector iroDetector;

    public Researcher(){

        researchGroup=new ResearchGroup();


    }
    public void getExperimentData(){
        iroDetector.viewData();
    }

    @Override
    public void writeEmployeeData() {

    }

    @Override
    public void readEmployeeData() {

    }

    @Override
    public void setFingerprint(String scannedFingerprint) {
      Fingerprint=scannedFingerprint;
    }

    @Override
    public String getFingerprint() {
        return Fingerprint;
    }
}
