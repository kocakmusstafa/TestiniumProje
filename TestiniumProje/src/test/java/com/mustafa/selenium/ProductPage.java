package com.mustafa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage {
    List<WebElement> result;
    WebDriver driver;

    private String searchWord = "bilgisayar";



    By search = By.xpath("//*[@class='sc-4995aq-0 sc-14oyvky-0 iYMTpq']");
    By searchButton = By.xpath("//*[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']");
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }
    public void sendAndClickSearch(){
        try {
            Thread.sleep(1000);
            driver.findElement(search).click();
            Thread.sleep(1000);
            driver.findElement(search).sendKeys("bilgisayar");
            Thread.sleep(1000);
            driver.findElement(searchButton).click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    By second = By.linkText("2");
    public void secondPage(){
        try {

            Thread.sleep(5000);
            driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
            //driver.findElement(second).click();
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
