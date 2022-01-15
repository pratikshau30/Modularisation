package QKART_SANITY_LOGIN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Home {
    ChromeDriver driver;
    String url = "https://crio-qkart-frontend.vercel.app"; 
    public Home(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void navigateToHome()
    {
        if(! this.driver.getCurrentUrl().equals(this.url))
        {
            this.driver.get(this.url);
        }
    }

    public Boolean PerformLogout() throws InterruptedException
    {
        try{
            WebElement logout_button = driver.findElement(By.className("MuiButton-text")); // Find the Logout Button
            logout_button.click();
            Thread.sleep(3000); // Wait for Logout to Complete
             return true;
        }catch(Exception e)
        {
            //Error while logout 
            return false;
        }
    }
}
