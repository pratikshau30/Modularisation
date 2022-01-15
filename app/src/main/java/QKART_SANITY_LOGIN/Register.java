package QKART_SANITY_LOGIN;

import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    ChromeDriver driver;
    String url = "https://crio-qkart-frontend.vercel.app/register"; 
    String lastGeneratedUsername = "";
    public Register(ChromeDriver driver)
    {
     this.driver = driver;   
    }

    public void navigateToRegisterPage()
    {
        if(!driver.getCurrentUrl().equals(this.url))
        {
            driver.get(this.url);
        }
    }

    public Boolean registerUser(String Username , String Password, Boolean makeUsernameDynamic ) throws InterruptedException
    {
        WebElement username_txt_box = this.driver.findElement(By.id("username")); // Finding the Username Text Box
        Timestamp timestamp = new Timestamp(System.currentTimeMillis()); // Get time stamp for generating a unique username 
        String test_data_username;
        if(makeUsernameDynamic)
            test_data_username = Username+"_"+String.valueOf(timestamp.getTime()); //concatenate the timestamp to string to form unique timestamp
        else
            test_data_username = Username;
        username_txt_box.sendKeys(test_data_username);//Type the generated username in the username field
        WebElement password_txt_box = this.driver.findElement(By.id("password")); // Finding the password Text Box
        String test_data_password = "abc@123";
        password_txt_box.sendKeys(test_data_password); // Entering the Password value
        WebElement confirm_password_txt_box = this.driver.findElement(By.id("confirmPassword")); // Finding the Confirm password text box                                                                                 
        confirm_password_txt_box.sendKeys(test_data_password); // Entering the Confirm Password Value
        WebElement register_now_button = this.driver.findElement(By.className("button")); // Finding the register now button 
        register_now_button.click(); // clicking the register now button
        this.lastGeneratedUsername = test_data_username;
        Thread.sleep(5000); // Wait for the Page to Complete Ragistration
        return this.driver.getCurrentUrl().endsWith("/login");
    }
}
