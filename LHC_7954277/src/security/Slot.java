package security;

import java.util.Scanner;

public class Slot extends Reader implements IROSlot {
    private java.util.Scanner scanner;
    private String scan;

    @Override
    public String getScan() {
        scanner=new Scanner(System.in);
        scan = scanner.next();
        return scan;
    }
}
