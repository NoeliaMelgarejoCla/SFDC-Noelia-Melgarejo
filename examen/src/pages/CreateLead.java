package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by noelia on 8/9/2015.
 */
public class CreateLead {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id="name_salutationlea2")
    @CacheLookup
    private WebElement selectId;
    @FindBy(id = "name_lastlea2")
    @CacheLookup
    private WebElement setLastName;
    @FindBy(id = "lea3")
    @CacheLookup    private WebElement setCompany;
    @FindBy(xpath = ".//*[@id='lea20_lkwgt']/img")
    @CacheLookup
    private WebElement LinkLookupCampain;

    public CreateLead(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,15);
        PageFactory.initElements(driver,this);
    }
    public CreateLead selectFirstName(){
        Select select=new Select(selectId);
        select.isMultiple();
        select.selectByValue("Mrs.");
        return this;

    }
    public CreateLead setLastName(String lastName){
        setLastName.clear();
        setLastName.sendKeys(lastName);
        return this;
    }

    public CreateLead setCompany(String company){
        setCompany.clear();
        setCompany.sendKeys(company);
        return this;
    }
    public SelectOpotunities selectCampain(String campain){
        LinkLookupCampain.click();
        return new SelectOpotunities(driver,campain);

    }
}
