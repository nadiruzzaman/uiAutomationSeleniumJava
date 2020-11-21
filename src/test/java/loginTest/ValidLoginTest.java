package loginTest;

import base.ScriptBase;
import controller.Login;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {

    Login login;

    @Test
    public void verifySignInTabDisplayed(){
        login=new Login(driver);
        login.signInTabDisplay();


    }

    @Test
    public void verifyValidSignIn(){
        login=new Login(driver);
        login.validLogin(driver,"email","test321@test.com","passwd","Admin123");
    }
}
