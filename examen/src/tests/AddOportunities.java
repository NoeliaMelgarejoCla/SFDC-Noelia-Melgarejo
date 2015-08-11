package tests;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by noelia on 8/9/2015.
 */
public class AddOportunities {
    private TopBar topBar;
    private  MainApp mainApp;
    private final String nameAccount = "nameAcounFINAL";
    private final String oportunityName = "nameeeoporuFINAL";
    private  final String date= "8/10/2015";
    private  final String stage= "Prospecting";
    private pages.AddOportunities addOportunities ;
    private Container con;

   @BeforeClass
   protected void setUp() {
       LoginPage loginPage=new LoginPage();
       mainApp=loginPage.setUsernameTxt("noelia.melgarejo.c@jalasoft.com").setPasswordTxt("TesInt10").clickLoginBtn();
       mainApp.goToTopBar().clickaccountLink().clicknewAccountCampain().setAccountName(nameAccount).clickSave();

    }

    @Test
    public void testCampains(){

        addOportunities = mainApp.goToTopBar().clickoportunitiesLink().clicknewOportunities().setOporunityName(oportunityName).setDate(date).selectStage(stage);
        SelectOpotunities oportunities =   addOportunities.selectIconoportunities(nameAccount);
         con= addOportunities.clickSave();

        Assert.assertEquals(oportunityName,con.oportunityName(oportunityName));
        Assert.assertEquals(date,con.oportunityName(date));
        Assert.assertEquals(stage,con.oportunityName(stage));
        Assert.assertEquals(nameAccount,con.linkNameAccount(nameAccount));


    }

    @AfterClass
    public void tearDown() {

        con.clickDeleteLeadLink();
    }

}
