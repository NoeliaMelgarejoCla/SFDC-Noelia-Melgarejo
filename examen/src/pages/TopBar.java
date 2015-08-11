package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Carlos Gonzales on 7/29/2015.
 */
public class TopBar {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText = "Leads")
    @CacheLookup
    private WebElement leadlink;
    @FindBy(linkText = "Campaigns")
    @CacheLookup
    private  WebElement campaignsLink;
    @FindBy(linkText = "Accounts")
    @CacheLookup
    private  WebElement accountLink;

    @FindBy(linkText = "Opportunities")
    @CacheLookup
    private  WebElement oportunitiesLink;

    public TopBar(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public CreateLink clickLeadlink() {
        wait.until(ExpectedConditions.elementToBeClickable(leadlink));
        leadlink.click();
        return new CreateLink(driver);
    }
    public CreateLink clickCampaignsLink(){
        wait.until(ExpectedConditions.elementToBeClickable(campaignsLink));
        campaignsLink.click();
        return new CreateLink(driver);
    }
    public CreateLink clickaccountLink(){
        wait.until(ExpectedConditions.elementToBeClickable(accountLink));
        accountLink.click();
        return new CreateLink(driver);
    }
    public CreateLink clickoportunitiesLink(){
        wait.until(ExpectedConditions.elementToBeClickable(oportunitiesLink));
        oportunitiesLink.click();
        return new CreateLink(driver);
    }


}
