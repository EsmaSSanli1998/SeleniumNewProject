package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);

        //Add Element butonuna basin
        //css selector'de text kullanimi yoktur
        //css selector ile locate alimi -->tagneme --attribute--=--attribute ün degeri
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();

        Thread.sleep(2000);


        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("delete butonu görünür");
        }else{
            System.out.println("delete butonu görünür degil");
        }//delete butonu görünür


        Thread.sleep(2000);

        //Delete butonuna basin
        deleteButonu.click();


        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        //css'te text kullanimi olmadigi icin yalnizca tag aldik. attribute de yoktu
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("add remove element yazisi görünür");
        }else{
            System.out.println("add remove element yaziis görünür degil");
        }//add remove element yazisi görünür

        Thread.sleep(2000);


        //Sayfayı kapatın
        driver.close();

        /*

        Xpath ve cssSelector arasındaki farklar:
      -------------------------------------------
        - Xpath text ile calısır.
        - cssSelector text ile calısmaz
        - Xpath index'e göre arama yapabilir.Daha fazla kombinasyona sahiptir.
        - cssSelector index'e göre arama yapamaz. Daha hızlı calısır

         */

    }
}
