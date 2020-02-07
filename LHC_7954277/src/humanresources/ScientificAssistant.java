package humanresources;

import java.util.Date;

public class ScientificAssistant extends Employee {
    private Date periodFrom;
    private Date getPeriodUntil;

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
