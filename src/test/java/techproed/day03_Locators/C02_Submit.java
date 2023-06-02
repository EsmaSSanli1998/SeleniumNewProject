package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasina gidiniz
        driver.get(" https://www.amazon.com");


        //2. yol: aramakutusunu locate ediniz ve Nutella aratınız
        WebElement aramaKutusu2 = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu2.sendKeys("Nutella" );
        aramaKutusu2.submit();


        Thread.sleep(2000);
        //asker gibi kapida bekler, iki saniye bekle derseniz, o kadar sure kodlarinizi bekletir.

        // sayfayı kapatınız
        driver.close();

    }
}
