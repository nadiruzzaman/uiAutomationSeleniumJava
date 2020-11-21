package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


 @FindBy(xpath = "//a[@title='Log in to your customer account']")  WebElement signInTab;
 @FindBy(css = "#SubmitLogin > span") WebElement loginSubmit;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void signInTabDisplay(){
        signInTab.isDisplayed();
        System.out.println(signInTab.getText());
    }


    public void universalIdSendKey(WebDriver driver,String id,String emailIdOrPass){
        driver.findElement(By.id(""+id+"")).sendKeys(emailIdOrPass);
    }
    public void universalIdClick(WebDriver driver,String id){
        driver.findElement(By.id(""+id+"")).click();
    }
    public void universalIdDisplay(WebDriver driver,String id){
        driver.findElement(By.id(""+id+"")).isDisplayed();
    }

    public void validLogin(WebDriver driver,String userId,String email,String passId,String Password){
        signInTab.click();
        universalIdSendKey(driver,userId,email);
        universalIdSendKey(driver,passId,Password);

        loginSubmit.click();


    }


}
