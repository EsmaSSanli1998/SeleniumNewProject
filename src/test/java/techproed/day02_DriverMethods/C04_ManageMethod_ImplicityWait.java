package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethod_ImplicityWait {//dolaylı olarak BEKLE
    // bir sayfadaki tüm web elementlerin oluşmasını max süre dolana kadar bekler
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
        Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */

        //techproed sayfasina gidelim
        String techproUrl = "https://techproeducation.com";
        String amazonUrl = "https://amazon.com";
        driver.get(techproUrl);

        //amazona gidelim
        driver.get(amazonUrl);


        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa başlığının Techpro içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime = "Techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED -> " + actualTitle);

        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();

        //sayfa başlığının Amazon içerdiğini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfayı kapatınız
        driver.close();



































    }
}
