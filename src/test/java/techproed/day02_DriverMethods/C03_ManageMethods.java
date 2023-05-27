package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'a gittikten sonra ilk is olarak sayfayi her zaman maximize yapmaliyiz

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu " + driver.manage().window().getPosition());
        //manage().window() pencereyi yönet, getPosition() pozisyonunu getir.

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari " +driver.manage().window().getSize());
        //getSize() sayfanin boyutunu, size'ini getir

        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        //maximize() sayfayi ekran boyutuna getirir


        //Techpro sayfasina gidelim
        driver.get("https://techproeducation.com/");


        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu " + driver.manage().window().getPosition());


        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari " +driver.manage().window().getSize());
        Thread.sleep(3000);


        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //sleep() exception firlatir. add signature yapiyoruz, maine "throws InterruptedException" ekliyoruz
        //minimize() ekrani baslangica kücültür


        //Sayfayi fullScreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir

        //Sayfayı kapatınız
        driver.close();

        /*
        Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
        webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
        browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz.
        */

        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer web elementidir.Bunlarin butunu web sayfasini olusturur.
















    }
}
