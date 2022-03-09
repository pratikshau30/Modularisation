package QKART_SANITY_LOGIN;
import org.openqa.selenium.chrome.ChromeDriver;



public class Home {
    ChromeDriver driver;
    String url = "https://crio-qkart-frontend-qa.vercel.app"; 
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
    /*Function Name: VerifyLoginButton -> return true if Login Button Exists
    */
    public Boolean VerifyLoginButton() throws InterruptedException
    {
        boolean status=false;
        // TODO: CRIO_TASK_MODULE_DEBUGGING: Implement logic to verify existence of Login Button

        return status;
    }

    /*Function Name: clickLoginButton -> return true if Login Button was clicked 
    */
    public Boolean clickLoginButton() throws InterruptedException
    {
        boolean status=false;
        // TODO: CRIO_TASK_MODULE_DEBUGGING: Implement logic to click on Login Button

        return status;
    }

    /*Function Name: VerifyLoginButton -> return true if Register Button Exists
    */
    public Boolean VerifyRegisterButton() throws InterruptedException
    {
        boolean status=false;
        // TODO: CRIO_TASK_MODULE_DEBUGGING: Implement logic to verify existence of Register Button

        return status;
    }

    /*Function Name: clickLoginButton -> return true if Register Button was clicked 
    */
    public Boolean clickRegisterButton() throws InterruptedException
    {
        boolean status=false;
        // TODO: CRIO_TASK_MODULE_DEBUGGING: Implement logic to click on Register Button

        return status;
    }
}
