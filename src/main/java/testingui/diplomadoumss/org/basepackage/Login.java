/**
 * @author: jricaldi
 */

package testingui.diplomadoumss.org.basepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[1]")
    private WebElement userNameField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[2]")
    private WebElement passwordField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/button")
    private WebElement loginButton;

    public void clickLoging()    {
        loginButton.click();
    }

    public void setUser(String user)
    {
        userNameField.sendKeys(user);
    }
    public void setPassword(String pass)
    {
        passwordField.clear();
        passwordField.sendKeys(pass);
        passwordField.sendKeys(Keys.TAB);
    }

}