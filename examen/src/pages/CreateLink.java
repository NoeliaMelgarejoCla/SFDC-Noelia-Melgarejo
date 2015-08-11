package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateLink {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(linkText = "Create New View")
    @CacheLookup
    private WebElement createNewViewLink;
    @FindBy(name = "new")
    @CacheLookup
    private WebElement newButton;
   private WebElement priorityMenu;

    public CreateLink(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    public NewViewContainer clickCreateNewViewLink (){
        wait.until(ExpectedConditions.elementToBeClickable(createNewViewLink));
        createNewViewLink.click();
        return new NewViewContainer(driver);

    }
    public CreateLead clicknewButtonLead(){
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new CreateLead(driver);

    }
    public AddAccount clicknewButtonCampain(){
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new AddAccount(driver);

    }
    public AddAccount clicknewAccountCampain(){
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new AddAccount(driver);

    }

    public AddOportunities clicknewOportunities(){
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new AddOportunities(driver);

    }

}



