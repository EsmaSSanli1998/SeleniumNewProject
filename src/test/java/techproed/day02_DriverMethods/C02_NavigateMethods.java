package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");
        //get() methodu ile ayni mantikta calisir

        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa başlığı : "+driver.getTitle());

        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();

        //Sayfa başlığını yazdıralım
        System.out.println("Techproeducation Sayfa Başlığı : "+driver.getTitle());

        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon sayfasi Url'i" + driver.getCurrentUrl());

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);//java kodlarini bekletmek icin Thread.sleep(); yazdik

        //Sayfayi kapatalim
        driver.close();












    }
}
