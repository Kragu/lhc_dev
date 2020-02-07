package humanresources;

import security.IROIrisScanner;

public interface IReception {
    public void setIrisScanner(IROIrisScanner scanner);
    public void createIDCard(Visitor visitor) throws Exception;
}
