package loginTest;

import base.ScriptBase;
import controller.Login;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase  {

    Login login;

    @Test (priority = 1)
    public void verifySignInTabDisplayed(){
        login=new Login(driver);
        login.signInTabDisplay();


    }

    @Test (priority = 2)
    public void verifyValidSignIn(){
        login=new Login(driver);
        login.validLogin(driver,"email","test321@test.com","passwd","Admin123");
    }
}
