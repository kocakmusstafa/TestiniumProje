package com.mustafa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaskedPage {
    WebDriver driver;

    public BaskedPage(WebDriver driver){
        this.driver = driver;
    }


    WebElement hoverElement ;
    public void addBasket(){
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@product-id='649249296']//*[@class='gg-ui-button gg-ui-btn-primary']")).click();
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void goToBasked(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='basket-icon-title hidden-m hidden-t']")).click();

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deleteBasked(){
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@data-id='649249296']//*[text()='Sil']")).click();

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
