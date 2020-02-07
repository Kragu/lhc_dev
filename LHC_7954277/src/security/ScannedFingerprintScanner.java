package security;

public class ScannedFingerprintScanner extends Scanner implements IROGetScannedFingerprint {

    private java.util.Scanner scanner;
    private String scan;

    @Override
    public String getScan() {
        scanner=new java.util.Scanner(System.in);
        scan = scanner.next();
        return scan;
    }
}
