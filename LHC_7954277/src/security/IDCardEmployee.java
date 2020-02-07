package security;

import java.util.ArrayList;

public class IDCardEmployee extends IDCard {
    protected IDCardEmployee(int [][] iris, String fingerprint) throws Exception {
        this.isLocked=false;
        irisStructur=iris;
        id ="HelloLRC2020";
        chip = new Chip();
        chip.cryptPassword(id);
        chip2 = new Chip();
        chip2.cryptPassword2(fingerprint);

        permissionList = new ArrayList<Permission>();

    }
    public void addPermission(Permission permission) {
        permissionList.add(permission);}

    @Override
    public boolean getIsValid() {
        return isLocked;
    }
    public void lock(){
        this.isLocked=true;
    }
}
