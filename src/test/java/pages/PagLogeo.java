package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PagLogeo {


    private static WebDriver driver;


    private static By userField = By.id("user-name");
    private static By passField = By.id("password");
    private static By loginBtn = By.id("login-button");
    private static By errorMessage = By.cssSelector("[data-test='error']");


    public PagLogeo(WebDriver driver) {
        this.driver = driver;
    }


    public static void ingresarUsuario(String user) {
        driver.findElement(userField).sendKeys(user);
    }


    public static void ingresarPassword(String pass) {
        driver.findElement(passField).sendKeys(pass);
    }


    public static void clickLogin() {
        driver.findElement(loginBtn).click();
    }


    public static String UrlActual() {
        return driver.getCurrentUrl();
    }


    public static boolean errorVisible() {
        return !driver.findElements(errorMessage).isEmpty();
    }


    public static String obtenerTextoError() {
        if (errorVisible()) {
            return driver.findElement(errorMessage).getText();
        }
        return "";


    }

    public static void login(String user, String pass){
        driver.findElement(userField).sendKeys(user);
        driver.findElement(passField).sendKeys(pass);
    }
}


