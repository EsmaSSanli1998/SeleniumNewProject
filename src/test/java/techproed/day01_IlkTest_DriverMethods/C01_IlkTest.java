package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        WebDriver driver = new ChromeDriver();
        //ChromeDriver(); türünde yeni  bir obje olusturduk

        driver.get("https://www.techproeducation.com/");
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.


    }
}


