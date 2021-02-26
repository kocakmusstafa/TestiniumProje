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




    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }
    public void sendAndClickSearch(){
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='sc-4995aq-0 sc-14oyvky-0 iYMTpq']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='sc-4995aq-0 sc-14oyvky-0 iYMTpq']")).sendKeys("bilgisayar");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']")).click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void secondPage(){
        try {

            Thread.sleep(1000);
            driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
            //driver.findElement(By.xpath("//a[text()='2']")).click();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
