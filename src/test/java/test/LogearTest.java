package test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PagLogeo;


import static org.junit.jupiter.api.Assertions.*;


public class LogearTest {


    private WebDriver driver;
    private PagLogeo loginPage;


    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.saucedemo.com/");


        loginPage = new PagLogeo(driver);
    }


    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    void loginCorrecto() throws InterruptedException {
        PagLogeo.login("standard_user", "secret_sauce");


        PagLogeo.clickLogin();


        String url = PagLogeo.UrlActual();


        assertTrue(url.contains("inventory"));

        Thread.sleep(2000);


    }


    @Test
    void loginIncorrecto() {
        PagLogeo.login("standard_user", "clave_erronea");

        PagLogeo.clickLogin();


        assertTrue(PagLogeo.errorVisible(),
                "Debería mostrarse un mensaje de error al fallar el login");


        assertTrue(PagLogeo.obtenerTextoError().contains("Username and password do not match"),
                "El mensaje de error no es el esperado");
    }
}


