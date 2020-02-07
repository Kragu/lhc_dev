package security;

import humanresources.Employee;

public enum SecurityCentre implements ISecurityCenter {
    instance;

    private Chip chip;
    private IDCardEmployee idCard;

    private IROIrisScanner irisScanner;
    private IROGetScannedFingerprint iroGetScannedFingerprint;
    @Override
    public void setIrisScanner(IROIrisScanner scanner) {
        this.irisScanner = scanner;
    }


    @Override
    public void createIDCard(Employee employee) throws Exception {

        int[][] iris = irisScanner.scanIris();
            idCard=new IDCardEmployee(iris, iroGetScannedFingerprint.getScan());
        }



    @Override
    public void lockIDCard() {
        idCard.lock();
    }

    @Override
    public void readEmployee() {

    }
}
