package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerizonSignInAutomation {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.bin", "/Applications/Google Chrome.app/Contents/MacOS");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Exercise 1: Navigate to the VerizonWireless.com site and click 'Sign In' option
        driver.get("https://www.verizonwireless.com/");
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"gnav20-sign-id\"]/span/span"));
        WebElement signInSecondLink = driver.findElement(By.xpath("//*[@id=\"gnav20-sign-id-list-item-1\"]"));
        signInLink.click();
        signInSecondLink.click();

        // Exercise 2: Enter Username, Enter Password, and click on 'SignIn' Button
        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"IDToken1\"]"));
        usernameInput.sendKeys("james");
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"continueBtn\"]"));
        continueButton.click();

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"IDToken2\"]" +
                ""));
        passwordInput.sendKeys("your_password");
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"continueBtn\"]"));

        // Click on the 'SignIn' Button
        signInButton.click();

        // Close the browser
        driver.quit();
    }
}
