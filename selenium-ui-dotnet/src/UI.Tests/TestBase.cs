using System;
using NUnit.Framework;
using OpenQA.Selenium;

namespace Tests;

public class TestBase
{

[Test]
public void SampleTest()
    {
        WebDriver driver = new OpenQA.Selenium.Chrome.ChromeDriver();
        driver.Navigate().GoToUrl("https://www.aarong.com");
        Console.WriteLine("Title: " + driver.Title);
        driver.Quit();
        
    }
}
