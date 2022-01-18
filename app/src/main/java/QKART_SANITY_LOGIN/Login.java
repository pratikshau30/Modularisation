package QKART_SANITY_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    ChromeDriver driver;
    String url = "https://crio-qkart-frontend.vercel.app/login"; 
    public Login(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public void navigateToLoginPage()
    {
        if(! this.driver.getCurrentUrl().equals(this.url))
        {
            this.driver.get(this.url);
        }
    }
    /*Function Name: PerformLogin -> return true if login succeeds else return false
    Params: Username: username value for login
    Params: Password: password for the login
    */
    public Boolean PerformLogin(String Username, String Password) throws InterruptedException
    {
        //TODO: Implement Logic for Login
        
        return this.VerifyUserLoggedIn(Username);  // Validation step if login action succeeded 
    }

    public Boolean VerifyUserLoggedIn(String Username)
    {
        try{
            WebElement username_label = this.driver.findElement(By.className("username-text")); // find the username label on the
            return username_label.getText().equals(Username);
        }catch(Exception e)
        {
            //User May not have logged in 
            return false;
        }
                                                                                                                       // top right of the page
    }


}
