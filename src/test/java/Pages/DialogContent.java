package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent(){PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginBtn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addBtn;
    @FindBy(xpath = "(//div[@tabindex='0'])[1]")
    //(//div[@tabindex='0'])[1]
    //(//div[@class='oxd-select-text-input'])[1]
    //(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]
    public WebElement userRole;
    @FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement Status;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;
    @FindBy(xpath = "(//input[@autocomplete='off'])[1]")
    public WebElement usernameAdd;
    @FindBy(xpath = "(//input[@autocomplete='off'])[2]")
    public WebElement passwordAdd;
    @FindBy(xpath = "(//input[@autocomplete='off'])[3]")
    public WebElement passwordAddConfirm;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveBtn;
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]//div")
    public WebElement Ess;
    @FindBy(xpath = "//div[@role='listbox']")
    public WebElement listbox;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchBtn;

    @FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
    public WebElement pencil;

    @FindBy(xpath = "//h6[text()='Add User']")
    public WebElement addUser;
}
