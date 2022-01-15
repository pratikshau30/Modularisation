package QKART_SANITY_LOGIN;
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
    /*Function Name: PerformLogout => return true if logout succeeds else return false
    */
    public Boolean PerformLogout() throws InterruptedException
    {
        boolean status=false;
        //TODO: Implement logout Logic

        return status;
    }
}
