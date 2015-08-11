package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Noelia Melgarejo on 8/10/2015.
 */
public class AddOportunities {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id = "opp3")
    @CacheLookup
    private WebElement setOportunityname;

    @FindBy(id = "opp9")
    @CacheLookup
    private WebElement date;
    @FindBy(xpath = ".//*[@id='opp4_lkwgt']/img")
    @CacheLookup
    private WebElement LinkLookupOportunities;

    @FindBy(css = "#bottomButtonRow > input[name=\"save\"]")
    @CacheLookup
    private WebElement saveBtn;



    public AddOportunities(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public AddOportunities setDate(String datevalue) {

        date.clear();
        date.sendKeys(datevalue);
        return this;
    }
    public AddOportunities setOporunityName(String name) {

        setOportunityname.clear();
        setOportunityname.sendKeys(name);
        return this;
    }

    public SelectOpotunities selectIconoportunities(String campain){
        LinkLookupOportunities.click();
        return new SelectOpotunities(driver,campain);

    }

    public Container clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveBtn.click();

        return new Container(driver);
    }



    public AddOportunities selectStage(String stage) {
        new Select(driver.findElement(By.id("opp11"))).selectByVisibleText(stage);
        return this;
    }

}
