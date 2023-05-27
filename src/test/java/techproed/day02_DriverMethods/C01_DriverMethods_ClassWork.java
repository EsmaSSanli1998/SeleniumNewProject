package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    /*
    ODEVIMIZ

    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin "Amazon" icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url'inin "amazon" icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
    Sayfayi kapatin.

     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();//driver.getTitle'i bir String'e assign ettik
        String expectedTitle = "Amazon";//Burada bizden ne istendiyse o degeri yazariz. Amazon istendigi icin
        //deger olarak Amazon yazdik
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //TEST PASSED sonucunu verdi.
        //bir harfi kucuk yazdik ornek amazon yazinca TEST FAILED sonucu yazildi.

        //tester olarak asil amacimiz actual ile expected karsilastirilmasidir.
        // actual expected i iceriyor ise passed icermiyor ise failed aliriz

        //Url'in https://www.amazon.com olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED-> " +actualUrl);


        //Sayfayı kapatalım
        driver.close();//Browser'i kapatir
        //driver.quit()->birden fazla browser hepsini kaoatir









    }
}
