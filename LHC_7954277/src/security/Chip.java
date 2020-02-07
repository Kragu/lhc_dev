package security;

import humanresources.IGetPersonName;

public class Chip implements IGetPassword,IChangePassword{
    private Crypting crypting;
    private IGetPersonName iGetPersonName;

    private String password;
    private String passwordSaver;

    @Override
    public String getPassword(){
        return passwordSaver;
    }
    public void setPassword(){

    }
    @Override
    public void cryptPassword(String password) throws Exception {
        this.passwordSaver=password;
        crypting = new Crypting(password,iGetPersonName.getName());
        this.password= crypting.getAESPassword();
        this.password = password;

    }
    public void cryptPassword2(String password) throws Exception {

        crypting = new Crypting(password,iGetPersonName.getName());
        this.password= crypting.getMD5Password();
        this.password = password;
    }

}
