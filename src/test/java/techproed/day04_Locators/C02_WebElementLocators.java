package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
            driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);
            //id="twotabsearchtextbox" almak için sırayla CTRL+C ,  CTRL+F ve CTRL+V yapıyoruz.
            //sadece id kismini almak icin alacağımız yerin üstünü çift tıklariz.
            //sendKeys(); yazi göndermek icin kullanilir
            //Keys.ENTER --enter a bas
            //Bu yöntem, bir web sayfasındaki bir metin giriş alanına veri göndermek için kullanılır.

        // sonuc yazısını yazdırın
           List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
            //unique olmadigi icin findElements() kullandik. "sg-col-inner" yazisindan 120 tane var.

            WebElement sonucYazisi = sonucYazilari.get(0);
           //bizim kullanacagimiz "sg-col-inner" yazisi-sonuc yazisi index i 0

            //System.out.println(sonucYazisi);//referans verir
            //[[ChromeDriver: chrome on WINDOWS (ae9cd0ac285e22eb696319db2be429f3)] -> class name: sg-col-inner]

            System.out.println(sonucYazisi.getText());//sonucu String olarak verir
            //1-16 of 184 results for "city bike"

        // sonuc sayısını yazdırın
           String sonucSayisi [] = sonucYazisi.getText().split(" ");
           //getText()  String e cevirir
           //split(" ") bosluklardan parcaalar
            System.out.println(Arrays.toString(sonucSayisi));
            System.out.println(sonucSayisi[2]);//209


        // ilk ürünün locatini alın
           List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
           WebElement ilkUrun = sonuclar.get(0);//sonuclar listesindeki ilk ürün
            //List'lerde index 0 dan başladığı için get(0) yaparsak ilk ürün, get(1) yaparsak 2. ürünü verir.


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
            System.out.println(ilkUrun.isDisplayed());//true
            //ilk ürün görünüyorsa true verir


        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
            System.out.println(ilkUrun.isEnabled());//true



        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
            System.out.println(ilkUrun.isSelected());//false
            //radio button ve checkbox gibi kutucuklu secimlerde kullanilir, bu sebeple secilemez ve false verir


        // ilk urune tıklayın
            ilkUrun.click();

        // sayfayı kapatın
        driver.close();



    }
}
        /*
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);
        //amazon sayfasinin sol ust kosesinde su sonucu gorduk: 1-16 of 177 results for "city bike"

        //sonuc yazisini yazdiralim
        //sonuc(1-16 of 177 results for "city bike") uzerine gelip sag click yaptik ve bu sonuc yazisinin
        //HTML kodlarini gorduk. span tagi yaninda 154 sonuc yaziliydi, oysa asagi cubukta 189 sonuc oldugunu
        // degerin uzerine tiklayinca gormustuk. Bizim sonucun tamamini almaya ihtiyacimiz vardi.
        // Tagi <div attribute'u class olan ve degeri "sg-col-inner"> kismini secmeye
        //karar verdik cunku class tum sonuclari kapsayacaktir. class'in degeri uzerine cift tikladik ve
        //CTRL C, CTRL F ile bu degeri asagi cubuk icinde yazdirdik. Biz bu degeri tiklayinca asagida 1 of 120
        //kadar bu degerin oldugunu gorduk. Bircok sonuc yazisindan ilk elementi almak istedik, bunu
        //kendimiz unique yapmak istedik.
        List<WebElement> sonucYazilari=driver.findElements(By.className("sg-col-inner"));
        120 tane ayni deger var ve biz bunu bir liste assign ettik. class'in degerini aldigimizdan
        className ile elementi arariz.

        //ilk sonuc yazisini bulacagiz cunku ilk sonuc yazisi tarali olacak ve bu unique olacak
        // WebElement sonucYazisi=sonucYazilari.get(0);    Listlerde index 0'dan baslar.
        // Ilk sonuc yazisini almak icin 0. index'i sectik.
        //System.out.println(sonucYazisi); bu sekilde yazinca String olarak sonucu gormeyiz, sonucYazisinin
        // hashcode/unu verir. String olarak yazdirmak icin getText()'i kullaniriz
        System.out.println(sonucYazisi.getText()); //1-16 of 186 results for "city bike"


        //sonuc sayisini yazdiralim
        String sonucSayisi []=sonucYazisi.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));//[1-16, of, 189, results, for, "city, bike"]
        System.out.println(sonucSayisi[2]);//189  bosluklardan alinca 2.index'te 189'ya ulasiriz

        sonuc sayimiz 186. Biz bunu kodumuzu calistirinca console'da gorduk. 1-16 of 189 olarak. Bu 186'yi almak
        icin split methodu ile 1-16 of 189 daki bosluklari alsak ve 186'yi yazdirsak olur
        Bunun icin sonucYazisi webelementini aldik
        sonucYazisi.getText() ile String'e cevirdik ve yanina split(" ") yazarak bosluklardan ayirma yaptik.
        split kullaninca Array return edeceginden, String bir Array'e assign ederiz.Array ile ilgili yazdirma
        yapilinca Arrays.toString yazmak zorundayiz. Boylece sonucu alabiliriz.

         */

