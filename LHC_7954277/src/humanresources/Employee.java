package humanresources;

import humanresources.lhc.IEmployee;
import humanresources.lhc.IROEmployee;

public abstract class Employee extends Person implements IROEmployee, IEmployee,ISetFingerprint,IROGetFingerprint {
    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;
    protected String Fingerprint;



}
