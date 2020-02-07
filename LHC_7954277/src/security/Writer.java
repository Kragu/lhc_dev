package security;

public class Writer {
    private IGetPassword iGetPassword;
    private IChangePassword iChangePassword;
    private String password;
    private String changedPassword;
    public void checkPassword() throws Exception {
        if (password==iGetPassword.getPassword())
            changePassword();

    }

    private void changePassword() throws Exception {
        iChangePassword.cryptPassword(changedPassword);
    }
}
