package humanresources;

public class Visitor extends Person implements ISetVisitorIris{
    @Override
    public void setIris(int[][] irisStructure) {
        iris = irisStructure;
    }

    @Override
    public int[][] getIris() {
        return iris;
    }
}
