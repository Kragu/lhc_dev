package security;

import humanresources.Employee;

public interface ISecurityCenter extends IROSecurityCentre {

    public void createIDCard(Employee employee) throws Exception;
    public void lockIDCard();

}
