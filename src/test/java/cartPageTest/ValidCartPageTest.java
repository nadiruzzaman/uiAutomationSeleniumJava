package cartPageTest;

import base.ScriptBase;
import controller.CartPage;
import org.testng.annotations.Test;

public class ValidCartPageTest  extends ScriptBase {
    CartPage cartPage;


    @Test (priority = 3)
    public void verifyCartButtonAvailableInHomePage(){
        cartPage=new CartPage(driver);
        cartPage.cartButtonDisplayed();

    }
    @Test (priority = 4)
    public void verifyCartButtonAvailableInSpecialsPgae(){
        cartPage=new CartPage(driver);
        cartPage.footerInfo(driver,"Specials");
        cartPage.cartButtonDisplayed();

    }
    @Test (priority = 5)
    public void verifyCartButtonAvailableInNewProductsPgae(){
        cartPage=new CartPage(driver);
        cartPage.footerInfo(driver,"New products");
        cartPage.cartButtonDisplayed();

    }
    @Test (priority = 6)
    public void verifyCartButtonAvailableInBestSellersPgae(){
        cartPage=new CartPage(driver);
        cartPage.footerInfo(driver,"Best sellers");
        cartPage.cartButtonDisplayed();

    }
    @Test (priority = 7)
    public void verifyCartButtonAvailableInOurStoresPgae(){
        cartPage=new CartPage(driver);
        cartPage.footerInfo(driver,"Our stores");
        cartPage.cartButtonDisplayed();

    }

    @Test (priority = 8)
    public void verifyCartButtonAvailableInContactUsPgae(){
        cartPage=new CartPage(driver);
        cartPage.footerInfo(driver,"Contact us");
        cartPage.cartButtonDisplayed();

    }
}
