package ORANGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup_Orange {

    static WebDriver driver;

    public static WebDriver Getdriver(){
        if (driver==null){

            driver= new ChromeDriver();
        }
        return driver;
    }
}
