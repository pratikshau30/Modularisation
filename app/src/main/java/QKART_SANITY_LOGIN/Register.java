package QKART_SANITY_LOGIN;

import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    ChromeDriver driver;
    String url = "https://crio-qkart-frontend.vercel.app/register";
    String lastGeneratedUsername = "";

    public Register(ChromeDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegisterPage() {
        if (!driver.getCurrentUrl().equals(this.url)) {
            driver.get(this.url);
        }
    }

    /*
     * Function Name: registerUser -> returns boolean
     * Params: Username: username value for registration
     * Params: Password: password for the registered user
     * Params makeUsernameDynamic: if true, add a dynamic value to the username and
     * register else use the Username parameter as it is
     * Note: if makeUsernameDynamic==true, make the username dynamic and set the
     * value of this.lastGeneratedUsername =<dynamic username>
     */
    public Boolean registerUser(String Username, String Password, Boolean makeUsernameDynamic)
            throws InterruptedException {
        // TODO: Implement Register user Logic

        return this.driver.getCurrentUrl().endsWith("/login"); // Return true if registration succeds and re-directed to
                                                               // login page
    }
}
