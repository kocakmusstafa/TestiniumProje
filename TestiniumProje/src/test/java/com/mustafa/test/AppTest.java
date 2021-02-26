package com.mustafa.test;

import com.mustafa.selenium.BaskedPage;
import com.mustafa.selenium.GittiGidiyorHome;
import com.mustafa.selenium.LoginPage;
import com.mustafa.selenium.ProductPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {
    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\IdeaProjects\\TestiniumProje\\drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
    }
    @Test
    public void start() {
        GittiGidiyorHome gittiGidiyorapp = new GittiGidiyorHome(driver);
        gittiGidiyorapp.gotoGittiGidiyor();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gittigidiyor.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginGitiGidiyor();

        Assert.assertEquals(loginPage.loginControl(),"kocakmusstafa");

        ProductPage productPage =new ProductPage(driver);
        productPage.setSearchWord("Bilgisayar");
        productPage.sendAndClickSearch();
        productPage.secondPage();

        BaskedPage baskedPage = new BaskedPage(driver);
        baskedPage.addBasket();
        baskedPage.goToBasked();
        baskedPage.deleteBasked();





    }
}
