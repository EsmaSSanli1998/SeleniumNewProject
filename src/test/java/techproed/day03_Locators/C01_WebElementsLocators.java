package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementsLocators {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get(" https://www.amazon.com");

        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //id="twotabsearchtextbox" almak için sırayla CTRL+C ,  CTRL+F ve CTRL+V yapıyoruz.
        //sadece id kismini almak icin alacağımız yerin üstünü çift tıklariz.

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //sendKeys(); yazi göndermek icin kullanilir
        //Keys.ENTER --enter a bas
        //Bu yöntem, bir web sayfasındaki bir metin giriş alanına veri göndermek için kullanılır.

        //Eger bir webelement'i birden fazla kullanmayacaksaniz bir webelement'e assign etmeyebilirsiniz.

        Thread.sleep(2000);
        //asker gibi kapida bekler, iki saniye bekle derseniz, o kadar sure kodlarinizi bekletir.

        // sayfayı kapatınız
        driver.close();

        //Process finished with exit code 0 --yazisini gördüysek kodlarimiz hatasiz calismistir.
        //enter==submit

    }
}
