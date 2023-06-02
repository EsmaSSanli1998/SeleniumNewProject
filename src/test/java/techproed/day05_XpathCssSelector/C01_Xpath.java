package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitlyWait(); Bekleyeceği maksimum süre.


        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");


        // arama kutusuna "city bike"  yazıp aratın

        //WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //xpath bu sekilde kullanilir

        //aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        //Biz amazon sayfasinda HTML kodlarinin ciktigi yerin altinda xpath ile
        // locate almadan once id degeri iki tane cikmisti xpath ile locate yapinca
        // asagidaki cubuk yaninda deger bir olarak goruldu. Yani unique oldugunu anladik.

        //farkli xpath deneyelim

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);



        // Hybrid Bikes bölümüne tıklayın.

        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        //cift slash--bastaki tagname span--köseli parantez--burda text kullandigimiz icin @ yok--text yazilir--
        //parantez ac kapa--tirnak icinde kopyaladigimiz, kullanacagimiz kelime--köseli parantezi kapadik
        hybridBikes.click();

        // sonuc sayısını yazdırın

        WebElement sonucYazisi = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println("sonuc sayisi = " + sonucYazisi.getText());
        //getText() kod olarak degil normal yazi olarak görünmesi icin

        String sonucSayisi[] = sonucYazisi.getText().split(" ");
        System.out.println(sonucSayisi[0]);
        //normal yazi olarak sonuc yazisini aldik--split(" "); ile kelime bosluklarindan satiri böldük--
        // yalnizca 14 sayisini almak icin index 0 i aldik--yazdirdik


        //sonuc sayisi, kodumuzu calistirinca sag ust kosede goruldu(14 results for "city bike") ve
        // o sonuc yazisi uzerine gelip inspect yapinca HTML kodlari gorulur. Bu kod icerisinde
        // 14 results for olarak sonuc sayisinin yer aldigini gorduk. Bu kismin bir text oldugunu
        // anladik ve xpath ile locate alirken @'i kullanmadik text()= seklinde devam ettik.
        // Cubugun yan kisminda 1 of 1 yazildigindan unique oldugunu anliyoruz. Eger HTML kodunda
        // tagi span olan bir text iceren HTML kod cikmiyorsa bizde ne cikiyorsa ornek class
        // attribute'i cikti, onunla locate alabiliriz.



        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        //aldigimiz locate 1den fazla oldugu icin (20 tane) varolus sirasini index olarak eklememiz gerekir. aldigimiz
        //locate parantez icine alip parantezin disina köseli parantez ekleriz. icine almak istedigimiz siradaki
        // ürünün sira numarasini ekleriz


        //Sayfayı kapatınız
        driver.close();


        //text oldugunu nasil anliyorduk
        //elmasin disinda olacak ve attribute bagli olmayacak
    }
}
