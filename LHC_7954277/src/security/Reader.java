package security;

import humanresources.IGetVisitorIris;
import humanresources.IROGetFingerprint;


public abstract class Reader{



    private IROIrisScanner iroIrisScanner;
    private IROGetScannedFingerprint iroGetScannedFingerprint;
    private IROGetFingerprint iroGetFingerprint;
    private IGetVisitorIris iGetVisitorIris;
    private IGetPassword iGetPassword;
    private IROIsValid iroIsValid;
    private int [][] currentIris;
    private int [][] Iris;
    private boolean isValid;
    private java.util.Scanner scanner;
    private String currentPassword;

    public void ValidIDCardVisitor(){

         currentIris=iroIrisScanner.scanIris();
         Iris=iGetVisitorIris.getIris();
         isValid=true;
         for (int i=0;i<10;i++){
             for(int j=0;j<10;j++){
                 if (currentIris[i][j]!=Iris[i][j])
                     isValid=false;
             }
         }
        validPassword();
         idCardValid();


    }
    private void idCardValid(){
        if(iroIsValid.getIsValid()==false)
            isValid=false;

    }
    private  void validPassword(){
        scanner=new java.util.Scanner(System.in);
        currentPassword=scanner.next();
        if(iGetPassword.getPassword()!=currentPassword)
            isValid=false;
    }

    public void ValidIDCardEmployee(){
        currentIris=iroIrisScanner.scanIris();
        Iris=iGetVisitorIris.getIris();
        isValid=true;
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if (currentIris[i][j]!=Iris[i][j])
                    isValid=false;
            }
        }
            if(iroGetFingerprint.getFingerprint()!=iroGetScannedFingerprint.getScan())
                isValid=false;
            validPassword();
            idCardValid();
    }

}
