package com_orangehramlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_BrowserTesting {


        public static void main(String[] args) {
                String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
                //launch the Chrome browser
                WebDriver driver = new ChromeDriver();

                //open the Url into Browser
                driver.get(baseUrl);

                // Maximise Browser
                driver.manage().window().maximize();

                // We give Implicit wait to Driver
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

                //Print  the title of the page
                System.out.println("Title of the page :" + driver.getTitle());

                //Print the current url
                System.out.println("Current URL : " + driver.getCurrentUrl());

                //Print the page source
                System.out.println("Page Source " + driver.getPageSource());

                //Enter the email to email field
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

