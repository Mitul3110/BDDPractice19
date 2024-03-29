package hooks;

import driverfactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import searchpage.Searchpage;
import utilities.Configreader;

import java.io.IOException;
import java.util.Properties;

public class Hooks {

    private WebDriver driver;

    private Driverfactory driverfactory;

    private Configreader configreader;

    private Properties prop;

    @Before (order=0)
    public void getproperty() throws IOException {
    configreader= new Configreader(); // please explain this line as well as line 18
   prop= configreader.initcromebrowser();
    }

    @Before(order=1)

    public void openbrowser() {
        String browsername = prop.getProperty("browser");
        driverfactory = new Driverfactory();
        driver = driverfactory.initbrowser(browsername);
    }

    @After(order=0)
            public void teardwon(){
        driver.close();
        }
    }




