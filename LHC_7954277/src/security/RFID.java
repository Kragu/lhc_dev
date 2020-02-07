package security;

import java.util.Scanner;

public class RFID implements IRORFID {
    private Scanner scanner;
    private String scan;

    @Override
    public String getScan() {
        scanner=new Scanner(System.in);
        scan = scanner.next();
        return scan;
    }
}
