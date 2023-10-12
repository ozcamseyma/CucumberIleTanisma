package stepdefinitions;

import io.cucumber.java.en.Given;

import utilities.Driver;

public class Google {

    @Given("google sitesine gidilir")
    public void google_sitesine_gidilir() {
        Driver.getDriver().get("https://www.google.com.tr/");
    }


}
