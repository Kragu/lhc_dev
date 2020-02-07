package security;

import humanresources.Person;

public class IrisScanner extends Scanner implements IROIrisScanner{
    private java.util.Scanner scanner;
    private String scan;
    private int[][] result;

    @Override
    public int[][] scanIris() {
        scanner=new java.util.Scanner(System.in);
        scan = scanner.next();
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10;j++){
            result[j][i]=Integer.parseInt(String.valueOf(scan.charAt(j+i)));

            }

        }
        return result;
    }
}
