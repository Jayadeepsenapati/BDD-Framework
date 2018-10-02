package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotemailpage 
{
public WebDriver driver;

@FindBy(id="recoveryIdentifierId")
public WebElement remail;

public Forgotemailpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


}
