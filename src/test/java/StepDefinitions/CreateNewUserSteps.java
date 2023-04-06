package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.Key;
import java.time.Duration;

public class CreateNewUserSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();




    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("Login as default informations")
    public void loginAsDefaultInformations() {
        dc.sendKeysFunction(dc.username, "Admin");
        dc.sendKeysFunction(dc.password, "admin123");
        dc.clickFunction(dc.loginBtn);

    }

    @And("Click on the Admin from leftnav")
    public void clickOnTheAdminFromLeftnav() {
        ln.clickFunction(ln.adminLeftNav);
    }

    @And("Click add button and fill in the informations")
    public void clickAddButtonAndFillInTheInformations() {
        dc.clickFunction(dc.addBtn);
        dc.clickFunction(dc.userRole);
        Actions aksiyon=new Actions(GWD.getDriver());
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ENTER).build().perform();
        aksiyon.keyUp(Keys.ENTER).build().perform();

        dc.clickFunction(dc.Status);

        Select selectStatus = new Select(dc.Status);
        selectStatus.selectByIndex(0);
        dc.sendKeysFunction(dc.employeeName, "Cucumber");
        dc.sendKeysFunction(dc.usernameAdd, "Salatalik123321");
        dc.sendKeysFunction(dc.passwordAdd, "cacik3535");
        dc.sendKeysFunction(dc.passwordAddConfirm, "cacik3535");


    }

    @And("Click Save button")
    public void clickSaveButton() {
        dc.clickFunction(dc.saveBtn);
    }

    @Then("Verify the new user is in the list")
    public void verifyTheNewUserIsInTheList() {
    }
}
