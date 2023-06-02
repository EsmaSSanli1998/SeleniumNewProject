package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitlyWait(); Bekleyeceği maksimum süre.

        //"https://www.amazon.com" sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        String actuelTagName = aramaKutusu.getTagName();//actuel gercek demek
        //gercek tagName i teste eder

        String expectedTagName ="input";//beklenen tagname in bu oldugunu test eder

        if (actuelTagName.equals(expectedTagName)){//actuelTagName, expectedTagName'e esit midir?
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //Arama kutusunun name attribute'ünün degerinin "field-keywords" oldugunu test edin
        String actuelAttribute = aramaKutusu.getAttribute("name");//Attribute degerini test eder

        String expectedAttribute = "field-keywords";//beklenen attribute degeridir

        if (actuelAttribute.equals(expectedAttribute)){//actuelAttribute, expectedAttribute'e esit midir?
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //Sayfayi kapatin
        driver.close();

        //Label tag'in da ki for atribute'nun değeri ile
        //İnput tag'in da ki id atribute'nun değeri her zaman aynı olmak zorundadır. HTML dersi.

        /*
        Sorumuza gore arama kutusunu locate ettik. HTML kodlari icinde id, class, label, type gibi attribute'lerin
        oldugunu gorduk. Biz id oldugunu gordugumuz ve id uniqe oldugundan id attribute'ni alamaya karar verdik.
        Biz bir webelement'i locate etmek istiyorsak bu unique olmali. id attribute'nin degeri ve for attribute'nin
        degerleri ayni yani twotabsearchtextbox. Bunun uzerine baska id var mi? varsa onun degeri twotabsearchtextbox
        var i diye baktik. Olmadigini buna gore bu degerin uniqe oldugunu anlamis olduk.For'un degerinin ayni
        olmasi bu degerin uniqe olmasina engel degil.
        findElement'i By.id ile locate ettik. id value'sunun unique oldugunu anladik ve onu alip parantez
        icerisine yerlestirdik. Unique olan element icin findElements degil finElement methodunu kullaniriz.
        Bunu bir liste degil WebElement'e assign ederiz.
         */



    }
}
