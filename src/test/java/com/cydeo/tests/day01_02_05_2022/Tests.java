package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification: PASSED!");
        }else{
            System.out.println("Title verification: FAILED!");
        }

        driver.navigate().to("https://www.etsy.com");




    }
}
/*
TC03
//Setup the "browser driver"

        //Go to "https://www.google.com"

        //Verify the title contains "Google"

        //Navigate to "https://www.etsy.com"

        //Verify not in google page

        //Verify the title  contains "Etsy"
 */