package security;

import java.util.ArrayList;
import java.util.Date;

public abstract class IDCard implements IROIsValid{
    protected String id;
    protected Date validFrom;
    protected Date validUntil;
    protected int[][] irisStructur= new int[10][10];
    protected ArrayList<Permission> permissionList;


    protected boolean isLocked;
    protected Chip chip;
    protected Chip chip2;

    protected IDCard() throws Exception{

    }



}
