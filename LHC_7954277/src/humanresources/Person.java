package humanresources;

public abstract class Person implements IGetPersonName{
    protected int id;
    protected String name;
    protected int[][] iris=new int[10][10];

    @Override
    public String getName() {
    return name;
    }
}
