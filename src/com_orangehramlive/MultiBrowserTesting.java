package com_orangehramlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowserTesting {

    public static void main(String[] args){
      String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        //Launch the Edge Browser
        WebDriver driver=new EdgeDriver();

        //open the Url in to the browser
        driver.get(baseUrl);

        //maximize Browser size
        driver.manage().window().maximize();

        //we give implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        // Get the Title of the page
        System.out.println("Title of the page :" + driver.getTitle());

        //Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page Source " + driver.getPageSource());

        //Enter the Username to Username field
        WebElement usernameField = driver.findElement(By.name("username"));
        //Action
        usernameField.sendKeys("Admin");

        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Action
        passwordField.sendKeys("admin123");

        //Close the Browser
        driver.close();

    }
}








