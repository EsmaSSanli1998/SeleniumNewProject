package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get(" https://www.amazon.com");


        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List <WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi " +linklerListesi.size());


        // Linkleri konsolda yazdırın
        for (WebElement each:linklerListesi) {
            System.out.println(each.getText());
        }
        //linkler listesindeki her bir webelementi konsola yazdir
        //getText() linkleri String e dönüstürür, hashcode seklinde göstermez.


        // sayfayı kapatın
        driver.close();
    }
}

        /*
        driver.get("https://www.amazon.com");
        //linklerin tagi <a> dir.
        //soruda bizden kac tane link oldugunu bulmamiz istendiginden <a> tagini kullaniriz.
        //findElements ve By.tagName ile bulacagiz
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));//linklerin tagi a oldugu icin
        System.out.println("Linklerin Sayisi: " +linklerListesi.size());
        //kodumuzu calistirinca Linklerin Sayisi:319 sonucunu gorduk.

        //Linkleri yazdiracagiz. Tagi a olan tum web elementleri linklerListesi listimizde var.
        //for each loop ile yazdirmamiz mumkun.linklerListesi'ndeki herbir WebElement'i diyoruz for each icinde

        for (WebElement each:linklerListesi) {
        //System.out.println(each);sout icinde sadece each yazinca linklerin alt alta hashcode'lari
        //ile yazildigini gorduk. Linklerin String olarak yazdirilmasini istiyoruz. Bu nedenle
        //each olan WebElement'i each.getText() methodu ile String'e donusturmemiz gerekir.
        System.out.println(each.getText());
        //kodu calistirinca linkleri String olarak gorduk. Ornegin:
        //Amazon
        //Your Account
        //Car ...
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.com");// Amazon'a gideriz.

         */

