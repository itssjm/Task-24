import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoBlazeTests {

    private WebDriver driver;
    private DemoBlazeHomePage homePage;
    private DemoBlazeSignUpPage signUpPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Moses/Documents/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
     // Maximize the window
        driver.manage().window().maximize();
        
        homePage = new DemoBlazeHomePage(driver);
    }

    @Test
    public void testSignUp() {
        String username = "testUser";
        String password = "testPassword";

        homePage.clickSignUpLink();
        signUpPage = new DemoBlazeSignUpPage(driver);
        signUpPage.enterUsername(username);
        signUpPage.enterPassword(password);
        signUpPage.clickSignUpButton();

       
    }

   

    
}