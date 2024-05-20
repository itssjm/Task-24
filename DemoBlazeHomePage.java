import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class DemoBlazeHomePage {

       
    @FindBy(id = "login2")
    private WebElement loginLink;
    
    @FindBy(xpath = "//div[@id='logInModal']//button[@type='button'][normalize-space()='Close']")
    private WebElement element;

    @FindBy(id = "signin2")
    private WebElement signUpLink;
    
    @FindBy(xpath = "//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")
    private WebElement close;
    
    public void clickLoginLink() {
        loginLink.click();
    }
    
    public void clickCloseLink() {
    	close.click();
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }


   public DemoBlazeHomePage(WebDriver driver) {
      PageFactory.initElements(driver, this);
  }

   
}