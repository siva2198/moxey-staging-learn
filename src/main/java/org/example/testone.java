package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testone {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivaraman M\\Documents\\test drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.moxey.ai/cards-ui/authenticate/login");
        driver.findElement(By.id("username_new")).sendKeys("gaurav.gupta@moxey.ai");
        driver.findElement(By.id("password_new_show")).sendKeys("Msewa@123");
        driver.findElement(By.id("otpContainer")).click();

        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[1]")).sendKeys("1");
        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[2]")).sendKeys("2");
        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[3]")).sendKeys("3");
        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[4]")).sendKeys("4");
        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[5]")).sendKeys("5");
        driver.findElement(By.xpath("//div[@id=\"otpContainer\"]//following::input[6]")).sendKeys("6");
        driver.findElement(By.id("verifyOtpBtn")).click();

    }
}
