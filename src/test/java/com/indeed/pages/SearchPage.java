package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement signInButton;

    @FindBy(xpath="//span[@aria-label='Magnify icon']//*[name()='svg']")
    public WebElement searchIcon;
    @FindBy(xpath="//input[@type='search']")
    public WebElement searchfield;
    //a[@class='unified-search__result unified-search__result--focused']//span[@class='unified-search__result-content']
    @FindBy(xpath="//a[@class='unified-search__result unified-search__result--focused']//span[contains(text(),'.md')]")
    public WebElement searchResult;

    @FindBy(xpath="//h2[@class='app-sidebar-header__maintitle']")
    public WebElement sideBar;

}
