package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


 @FindBy(xpath = "//a[@title='Log in to your customer account']")  WebElement signInTab;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void signInTabDisplay(){
        signInTab.isDisplayed();
        System.out.println(signInTab.getText());
    }
}
