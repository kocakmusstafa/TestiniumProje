package com.mustafa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    LoginPage loginPage;
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    By girisYap = By.xpath("//*[@title='Giriş Yap']");
    By sifre = By.xpath("//*[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']");
    By userName = By.id("L-UserNameField");
    By pass = By.id("L-PasswordField");
    By login = By.id("gg-login-enter");
    public void loginGitiGidiyor(){
        try {
            Actions actions = new Actions(driver);

            driver.findElement(girisYap).click();
            Thread.sleep(1000);
            driver.findElement(sifre).click();
            Thread.sleep(1000);
            driver.findElement(userName).click();
            Thread.sleep(1000);
            driver.findElement(userName).sendKeys("kocakmusstafa@gmail.com");
            Thread.sleep(1000);
            driver.findElement(pass).click();
            Thread.sleep(1000);
            driver.findElement(pass).sendKeys("Mustafa-123321");
            Thread.sleep(1000);

            driver.findElement(login).click();


            Thread.sleep(3000);




        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public String loginControl(){
        String LoginControl = driver.findElement(By.xpath("//*[text()='kocakmusstafa']")).getText();
        //String LoginControl = driver.findElement(By.className("gekhq4-3 icMLoL")).getText();
        return LoginControl;

    }

}
