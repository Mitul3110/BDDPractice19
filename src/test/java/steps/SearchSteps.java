package steps;

import driverfactory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import searchpage.Searchpage;

public class SearchSteps {

    Searchpage searchpage= new Searchpage(Driverfactory.getdriver());


    @Given("user should be on Argos webpage")
    public void user_should_be_on_argos_webpage() {
        Driverfactory.getdriver().get("https://www.argos.co.uk/");
       String actual=searchpage.getutl();
        //Assert.assertThat(actual, Matchers.endsWith("argos.co.uk/"));

    }

    @When("user accepts cookies")
    public void user_accepts_cookies() {searchpage.setCookies();

    }

    @When("user searches for {string} in the search bar")
    public void user_searches_for_in_the_search_bar(String string) {searchpage.setSearchbox(string);


    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {searchpage.setSearchbutton();

    }

    @Then("user verifies gym products on argos page")
    public void user_verifies_gym_products_on_argos_page() {
        String actual= searchpage.settext();
       // Assert.assertThat(actual,Matchers.equalTo("gym products"));


    }

}
