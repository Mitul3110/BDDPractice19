package driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driverfactory {


    public static ThreadLocal<WebDriver>Tslocal= new ThreadLocal<>();

   public WebDriver initbrowser(String browser){
       System.out.println("Browser name is "+ browser);
       if(browser.equals("firefox")){
           WebDriverManager.firefoxdriver().setup();
           Tslocal.set(new FirefoxDriver());}

       else if(browser.equals("chrome")){
           WebDriverManager.chromedriver().setup();
           Tslocal.set(new ChromeDriver());
       }
       else { System.out.println("give browser name "+ browser);}

           getdriver().manage().window().maximize();
           getdriver().manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
           getdriver().manage().deleteAllCookies();

           return getdriver();




   }  public static WebDriver getdriver() {return  Tslocal.get();}
}
