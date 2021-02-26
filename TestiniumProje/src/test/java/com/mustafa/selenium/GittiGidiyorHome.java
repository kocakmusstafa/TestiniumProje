package com.mustafa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GittiGidiyorHome {
    WebDriver driver;

    public GittiGidiyorHome(WebDriver driver){
        this.driver = driver;
    }

    public void gotoGittiGidiyor(){

        driver.get("https://www.gittigidiyor.com/");


    }

}
