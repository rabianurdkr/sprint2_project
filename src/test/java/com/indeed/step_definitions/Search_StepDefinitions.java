package com.indeed.step_definitions;

import com.indeed.pages.SearchPage;
import com.indeed.utilities.ConfigurationReader;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Search_StepDefinitions {
    SearchPage SearchPage = new SearchPage();

    @Given("user logged into the Dashboard")
    public void userLoggedIntoTheDashboard() {
        String url = ConfigurationReader.getProperty("qa_url");
        String username = ConfigurationReader.getProperty("emp");
        String password = ConfigurationReader.getProperty("pass");

        Driver.getDriver().get(url);
        SearchPage.usernameInput.sendKeys(username);
        SearchPage.passwordInput.sendKeys(password);
        SearchPage.signInButton.click();
    }
    @And("user clicks through the magnifying glass icon")
    public void userClicksThroughTheMagnifyingGlassIcon() {
        SearchPage.searchIcon.click();
    }

    @When("user types <files> and click on it")
    public void userTypesFilesAndClickOnIt(String SearchKeyword) {
        SearchPage.searchfield.sendKeys(SearchKeyword + Keys.ENTER);
        SearchPage.searchResult.click();
    }
    @When("user types {string} and click on it")
    public void userTypesAndClickOnIt(String searchKeyword) {
        SearchPage.searchfield.sendKeys(searchKeyword + Keys.ENTER);
        SearchPage.searchResult.click();
    }

    @Then("user sees the details side page of the file")
    public void userSeesTheDetailsSidePageOfTheFile() {
        Assert.assertTrue(SearchPage.sideBar.isDisplayed());
    }


}
