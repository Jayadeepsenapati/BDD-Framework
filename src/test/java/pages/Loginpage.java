package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
public WebDriver driver;

//Fill password field
@FindBy(name="password")
public WebElement pwd;

//Click on Password Next Button
@FindBy(id="passwordNext")
public WebElement pwdnext;

//Blank Password criteria xpath
@FindBy(xpath="//*[text()='Enter a password']")
public WebElement pwdblanker;

//Wrong password criteria xpath
@FindBy(xpath="//*[contains(text(),'Wrong password')]")
public WebElement pwdinvaliderr;

public Loginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void fillpwd(String x)
{
	pwd.sendKeys(x);
}
public void clickpwd()
{
pwdnext.click();
}

}//class close
