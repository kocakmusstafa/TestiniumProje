package com.mustafa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\IdeaProjects\\TestiniumProje\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //BaseUrl değişkenine url bilgisini atar.
        String baseUrl = "https://www.gittigidiyor.com";
        //Web sitesini browser da açar
        driver.get(baseUrl);

    }
}
