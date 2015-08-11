package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Carlos Gonzales on 7/29/2015.
 */
public class NewViewContainer {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id="fname")
    @CacheLookup
    private WebElement viewNameTxt;
    @FindBy(id="devname")
    @CacheLookup
    private WebElement viewUniqueNameTxt;
    @FindBy(id="fscope1")
    @CacheLookup
    private WebElement unconvertedLeadsRadBt;
    @FindBy(id="colselector_select_0")
    @CacheLookup
    private  WebElement selectorFields;
    @FindBy(xpath="//img[@class='rightArrowIcon']")
    @CacheLookup
    private WebElement  selectorFieldsBtn;

    @FindBy(xpath="//input[@name='save' and @data-uidsfdc='3']")
    @CacheLookup
    private WebElement saveBtn;


    public NewViewContainer(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
     public NewViewContainer setViewNameTxt(String viewName ){
         viewNameTxt.clear();
         viewNameTxt.sendKeys(viewName);

         return this;
     }
    public NewViewContainer setViewUniqueNameTxt(String viewUniqueName ){
        viewUniqueNameTxt.clear();
        viewUniqueNameTxt.sendKeys(viewUniqueName);
        return this;

    }
    public NewViewContainer selectUnconvertedLeadsRadBt(){
        unconvertedLeadsRadBt.click();
        return this;

    }
    public NewViewContainer selectFistValue(){
        Select select_multiple=new Select(selectorFields);
        select_multiple.isMultiple();
        select_multiple.selectByVisibleText("Salutation");
        select_multiple.selectByVisibleText("Is Email Bounced");
        List<WebElement> selectedOptions = select_multiple.getAllSelectedOptions();
        selectorFieldsBtn.click();
        return this;

    }
    public Container clickSaveBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveBtn.click();

        return new Container(driver);

    }

}
