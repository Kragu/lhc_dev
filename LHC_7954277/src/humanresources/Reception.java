package humanresources;

import security.*;

public enum Reception {
    instance;

    private IDCardVisitor idCardVisitor;

    private IROIrisScanner irisScanner;
    private ISetVisitorIris iSetVisitorIris;

    public void setIrisScanner(IROIrisScanner scanner) {
        this.irisScanner = scanner;
    }


    public void createIDCard(Visitor visitor) throws Exception{
        int [][] iris = irisScanner.scanIris();
        iSetVisitorIris.setIris(iris);
        idCardVisitor=new IDCardVisitor(iris,false);
        idCardVisitor.addPermission(Permission.Visitor);
    }

}
