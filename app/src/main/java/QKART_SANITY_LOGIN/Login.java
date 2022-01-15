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

    public Boolean PerformLogin(String Username, String Password) throws InterruptedException
    {
        WebElement username_txt_box = this.driver.findElement(By.id("username")); // Finding the Username Text Box
        username_txt_box.sendKeys(Username); // Enter the username in the login page
        Thread.sleep(1000); // Wait for user name to be entered
        WebElement password_txt_box = this.driver.findElement(By.id("password")); // Finding the password Text Box
        password_txt_box.sendKeys(Password);
        WebElement login_button = driver.findElement(By.className("button")); // Click on Login Button
        login_button.click(); // click the login Button
        Thread.sleep(5000); // Wait for Login action to complete 
        return this.VerifyUserLoggedIn(Username);
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
