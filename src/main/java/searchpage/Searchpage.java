package searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage {

    WebDriver driver;

    private By cookies= By.cssSelector("[class='button button-primary']");

    private By searchbox = By.cssSelector("input[role='combobox']");

    private By searchbutton= By.cssSelector("._2mKaC");

   private By Text= By.cssSelector("[class='styles__SearchTerm-sc-1haccah-1 eslAyR']");


  public Searchpage (WebDriver driver){this.driver=driver;}

   public  void setCookies() {driver.findElement(cookies).click();}

  public void setSearchbox (String name){driver.findElement(searchbox).sendKeys(name);}

    public void setSearchbutton(){driver.findElement(searchbutton).click();}

   public String settext(){ return driver.findElement(Text).getText();}

  public String getutl(){return  driver.getCurrentUrl();}
}
