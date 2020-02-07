package humanresources;

import security.IDCard;

import java.io.Reader;
import java.util.HashMap;

public enum IDCardManagement {
        ;
    private Reader reader;
    private HashMap<String, IDCard> idCardHashMap=new HashMap<>();

    public void assignIDCard(IDCard idCard, Employee employee){

    }

    public void lockIDCard(IDCard idCard){

    }
    public void clearIDCard(IDCard idCard){

    }

}
