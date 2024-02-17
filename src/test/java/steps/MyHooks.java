package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyHooks {
    public static WebDriver driver;
    @Before
    public void initialSetup(){
        System.setProperty("wehdriver.chrome.driver","src/test/resources/drivers/chrome/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.tendable.com/");

    }
    @After
    public void clearSetup(Scenario scenario){
        if(scenario.isFailed()){

        }
   driver.quit();
    }

}
