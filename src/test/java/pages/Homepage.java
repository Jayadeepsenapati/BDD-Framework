package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
public WebDriver driver; //here driver is used as a variable declaration

//user id fill field
@FindBy(name="identifier")
public WebElement uid;

//userid click Next
@FindBy(id="identifierNext")
public WebElement uidnext;

//Blank userid error msg
@FindBy(xpath="//*[contains(text(),'Enter an email')]")
public WebElement uidblankerr;

//Invalid e-mail id error message
@FindBy(xpath="(//*[contains(text(),'find your Google')])[2]")
public WebElement uidinvaliderr;

//Forgot e-mail Link click
@FindBy(xpath="(//*[contains(text(),'Forgot email')])[2]")
public WebElement forgotemail;

//Constructor Method
public Homepage(WebDriver driver) // driver is initialised by using consturctor method
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//Creating Method for Each Elements
public void filluid(String x)
{
	uid.sendKeys(x);
}
public void clickuidnext()
{
	uidnext.click();
}
public void clickforgotemail()
{
	forgotemail.click();
}

}//class close


