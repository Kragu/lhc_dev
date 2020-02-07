package security;

import java.util.ArrayList;

public class IDCardVisitor extends IDCard{
    public  IDCardVisitor(int[][] iris,boolean isLocked) throws Exception {
        this.isLocked=isLocked;
        irisStructur=iris;
        chip = new Chip();
        chip.cryptPassword(id);

        permissionList = new ArrayList<Permission>();

    }
    public void addPermission(Permission permission) {
        permissionList.add(permission);}

    @Override
    public boolean getIsValid() {
        return isLocked;
    }
}
