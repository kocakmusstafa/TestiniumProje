package com.mustafa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    LoginPage loginPage;
    private static String email;
    private static String pass;
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void setEmail(String email) {

        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



    public void loginGitiGidiyor(){
        try {
            Actions actions = new Actions(driver);

            driver.findElement(By.xpath("//*[@title='Giriş Yap']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("L-UserNameField")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("L-UserNameField")).sendKeys("kocakmusstafa@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.id("L-PasswordField")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("L-PasswordField")).sendKeys("xxxxxx");
            Thread.sleep(1000);

            driver.findElement(By.id("gg-login-enter")).click();


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
