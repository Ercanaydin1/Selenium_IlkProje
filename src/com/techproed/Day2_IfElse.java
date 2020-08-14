package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_IfElse {

    public static void main(String[] args) {
        //Java projemize. chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ercna\\OneDrive\\Belgeler\\selenium dependencis\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
         // contains -> bir kelimenin, bir yazı içerisinde geçip geçmediğini kontrol ediyordu.
        String amazonTitle = driver.getTitle(); // Books
        if( amazonTitle.contains("Books") ){
            System.out.println("Books kelimesini içeriyor.");
        }else{
            System.out.println("Books kelimesini İÇERMİYOR.");
        }
        driver.quit();

    }

}

