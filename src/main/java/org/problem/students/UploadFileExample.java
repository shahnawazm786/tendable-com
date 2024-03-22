package org.problem.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chrome/chromedriver.exe");

       WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/custom-drag-drop-file-upload/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"fileUpload-1\"]")).sendKeys("C:\\Misc\\24_Jan_2023.png");
        try {
            Thread.sleep(10000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        driver.quit();


       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/ajax-file-uploader/#google_vignette");
        try {
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        driver.findElement(By.cssSelector("input#demo1")).sendKeys("C:\\Misc\\24_Jan_2023.png");
        try {
            Thread.sleep(10000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        driver.quit();

    }
}
