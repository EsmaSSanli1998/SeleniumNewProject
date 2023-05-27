package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        System.out.println("Amazon sayfa basligi - "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+ driver.getCurrentUrl());
        String amazonWindowTitle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "
                +driver.getWindowHandle());

        driver.get("https://techproeducation.com");
        //önce amazon a sonra techproya gider.intellij yukardan asagiya calisir

        System.out.println("TechProED sayfa basligi - "+driver.getTitle());
        //son acilan sayfanin sayfa basligini verir

        //getTitle() methodu sayfanin basligini verir

        //getCurrentUrl() gidilen sayfanin URL'ini verir
        System.out.println("Techproed Actual Url : "+ driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());
        //Bilerek yoruma aldık her çalıştırdığımızda konsola bütün kaynak kodlarını vereceği için

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir.
        //Bu handle değerini sayfalar arası geçiş için kullanırız
        //Her pencere icin ayri deger verir
        //Yeni pencere actiktan sonra eski penceye dönmek icin bu kodu kullanacagiz
        System.out.println("Techproed Window Handle Değeri : "
                +driver.getWindowHandle());//156B7B83BB29C993FACBBE3CBBFDFD5F



    }
}
