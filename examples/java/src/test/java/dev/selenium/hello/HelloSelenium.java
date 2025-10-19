package dev.selenium.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
https://github.com/bestiejs/punycode.js/blob/master/punycode.js
        driver.get("https://selenium.dev");

        driver.quit();
    }
}
