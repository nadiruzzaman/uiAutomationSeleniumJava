package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(xpath = "//a[@title='View my shopping cart']")  WebElement cartButton;

    public CartPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void cartButtonDisplayed(){
        cartButton.isDisplayed();
    }


    public void footerInfo(WebDriver driver,String info){
        driver.findElement(By.xpath("//*[@id='block_various_links_footer']//a[@title='"+info+"']")).click();
    }

}
