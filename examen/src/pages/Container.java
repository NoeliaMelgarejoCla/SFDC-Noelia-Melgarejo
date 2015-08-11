package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by noelia on 8/7/2015.
 */
public class Container {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath="//option[@selected='selected']")
    @CacheLookup
    private WebElement SelectName;
    @FindBy(xpath= "//h2[contains(.,'Opportunity Detail')]/following::td//input[@title='Delete']")
    @CacheLookup
    private WebElement DeleteLeadLink;

    public Container(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    public String getNameSelectName(){

        return SelectName.getText();

    }
    public String oportunityName(String name){

        return driver.findElement(By.xpath("//div[text()='"+name+"']")).getText();

    }
    public String linkNameAccount(String name){

        return driver.findElement(By.linkText(name)).getText();

    }
    public String date(String name){

        return driver.findElement(By.xpath("//div[text()='"+name+"']")).getText();

    }
     public  DeleteAlert clickDeleteLeadLink(){
         DeleteLeadLink.click();
         return new DeleteAlert(driver);

     }

}
