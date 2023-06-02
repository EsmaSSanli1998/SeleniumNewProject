package techproed.day03_Locators;

public class Webelements_Notlari {

    //bir web sayfasindaki her sey webelementtir


    //bir webelemntin üzerine sag tik--incele dedigimizde
    //html kodlari cikar

    //Webelemetler: Button, Search, Text box, Headers, Tables

    //Webelement taglari: <html>, <body>, <label>,<input>, <a> vb.

    //Biz webelementlere ulasmak icin HTML kodlarini kullanacagiz.

    //Amazon sayfasina gittik ve herbir button, arama motoru,
    // fotograflar, linkler, etkilesimli olan ya da olmayan
    // yani bu sayfada bulunan hersey bir webelement'dir.

            /*
    Biz webelementlere ulasmak icin HTML kodlarini kullanacagiz.

    Web sayfasinda istedigimiz bir webelement uzerine gidip sag click yapip (incele)inspect'i tiklayinca HTML
    kodlarini goruruz.

    Biz arama kutusu uzerine gelip sag click yaptik ve incele'yi tikladik. Arama kutusunun HTML
    kodlarini asagida gorebildik. Dilersek bu kodlari yukari, saga veya sola alabiliriz.

    Amazon sayfasinda EN baslikli kisimda saga click yaptik ve inspect yaptik. Yine HTML kodlarini
    gorduk. Bu kodlar EN'e ait.

    Biz webelementlere erisebilmek icin bu HTML kodlarindan faydalanacagiz.

    Bir webelement'in HTML kodlarini inceledik. <tbody> tagi ile baslamiz ve </tbody> tagi ile
    sona ermis. Icerisnde <input>, <label> gibi taglari gorduk.



    Locators(Yer Bulucu-Konum Belirleyici)
    --------------------------------------------
    Biz bir webelement'in lokate'ini yani konumunu, yerini kodlarla alabilecegiz. Locate almak demek
    o webelementin yerini, konumunu belirleyecegiz.

    Biz Selenium'da Locators ile web sayfasindaki web ogelerini tanimlayacagiz. Aksi halde otomasyon
    yapamayiz. Biz web ogeleri uzerinde eylemeler gerceklestirmek, otomasyon islemi yapmak istiyorsak
    mutlaka locators'lari kullaniriz.

    Web elementlere ulasmak icin tag veya bazi attribute'leri kullanacagiz. Bunlarla ulasilamayan
    web elementler icin ozel olarak tanimlanan Xpath ve css locator'lari kullanilir. Xpath'in
    otomasyonda cikamayacagi alan yoktur. Bununla her turlu webelement'in locator'ini alabiliriz.

    8 locator alma yontemi vardir. En cok tutulan Xpath'dir.
    locator lari yollar gibi dusune bilirsiniz.hepsi ayni hedefe cikartir sizi.
    ama xpath en cok tercih edilen ve kesin sonuc veren yoldur

    Bir web elemetini tanimlamak icin 8 tane selenium locator vardir.

    1.id  ornek: id="twotabsearchtextbox" id bir attribute, " " icindeki value'dir
    2.name  ornek: name="field-keywords"   name bir attribute, " " icindeki value'dir
    3.class name  ornek: class="nav-input nav-progressive-attribute"
    4.tagName    ornek: input type="text" tagName en basta yazilir.Bu HTML kodun tagName'i input
    5.linkText
    6.partialLinkText
    7.xpath  //en cok kullanilan yontem
    8.cssSelector

    Locators bulmak icin kullanilan methodlar var.

    1) findElement() webelement'in yerini driver'in bulabilmesi icin bu yontem kullanilir.

    ornek: driever.findElement(Locator),


    2)findElement() methodunun  icine parameter olarak yazacagimiz Locator'in 8 locator'dan hangisi oldugunu
    belirtmek icin By.LocatorTuru("LocatorBilgisi"); kullanilabilir.

    ornek: driver.findElement(By.id("twotabsearchtextbox"));

    Biz 8 yontemden name yontemi ile bulmak istersek By.name("field-keywords") deriz. Yani hangi yontemi sectiysek,
    parantez icinde By. yaninda o yontemin adini yazacagiz ve ona gore parantez icine ona ait
    value'yu yerlestiririz.

    3)Locate ettigimiz Web Elementini kullanabilmek icin bir variable'a atama yapariz.

    ornek:  WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox));

    Interview sorusu: Kac tane locator alma yontemi vardir, isimleri nelerdir ve hangisini en cok
    tercih edersiniz?
    Normalde en cok xpath kullanilsa da bu sorunun cevabi id'yi tercih ederim olmali.
    Cunku id unique'dir.

    ÖRNEKLER:
    WebElement passwordTextBox =driver.findElement(By.className("form-control"));
    className'in sagindaki parantezde bosluklu bir yapi olursa hata verir.

    WebElement passwordTextBox = driver.findElement(By.linkText("Addresses"));

    WebElement passwordTextBox = driver.findElement(By. partialLinkText("dresses"));

    WebElement passwordTextBox =driver.findElement(By.tagName("input"));
    Birden cok öge döndürür, unique olmayabilir. Böyle olma ihtimaline karsi
    findElements olarak yazilmasi dogru olur.

            */
        /*
    By.id();
    ------------------
    WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox));

    Web ogesini tanimlamanin en populer yolu id kullanilmaktadir. id en guvenli ve en hizli
        locator secenegi olarak kabul gorur.

    Eger yanlis id locate edilirse: NoSuchElementException hatasi olusur.

    Boyle bir durum ile karsilasirsak hata veren satirdaki locatoru gozden gecirmeliyiz.

    id attribute'i yoksa kullanamayiz.


    By.name();
    --------------------
    once ilgili webelement uzerinde inspect yapariz ve HTML kodlarini goruruz. name nerede diye bakariz
    Cunku name yontemi ile locator'i almak istiyoruz. name karsisinda "field-keywords"'u gorduk.
    By.name() parantezi icerisine buldugumuz "field-keywords"'u yerlestiririz.

    WebElement password=driver.findElement(By.name("field-keywords"));

    By.className();
    -----------------
    ilgili webelement'in HTML kodlarina bakariz, class name varsa onu bulur ve asagidaki gibi
    kodumuzu yazariz. Ayni HTML kodunda id ya da name de olabilir. Biz hangi yontemi sectiysek onu
    aliriz.
    WebElement passwordTextBox=driver.findElement(By.className("form-control")

    Class attribute'u HTML kodunda yoksa kullanamayiz.

    Genelde class attribute ayni islevi yapan bir grup Web Elementi icin kullanilir.Class ve value
    unique ise kullanalim, degilse varsa id'yi kullanalim. Cunku unique olani almak daha dogrudur.

    Class attribute#nun degeri bosluk iceriyorsa genelde By.classname() ile yapilan locator'lar
    saglikli calismaz.

    By.linkText();
    -----------------
    <a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>

    Bu HTML kodunda linkText "Addresesses" olup bunu nereden anladik? Bir attribute'a esitlenmemis.
    Ayrica tag isaretlerinin disinda kalmis. Baglanti tagi olan <a> </a> kullanilmis, bu
    taglar arasinda kalmis.

    WebElement passwordTextBox=driver.findElement(By.linkText("Addresses"));

    Bu yalnizca HTML baglantilarini(link) tanimlamak icin kullanilablir.

    HTML link elementleri, bir web sayfasinda baglanti etiketi yani tag kisaltmasi olan <a>
    etiketi kullanilarak temsil edilir.

    Buyuk/kucuk harfe duyarlidir ve baglanti(link) metniyle eslesmelidir.


    By.partialLinkText();
    ---------------------------
    <a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>

    WebElement passwordTextBox=driver.findElement(By.partialLinkText("dresses"));
    linkin bir parcasi elimizde olup bu parcasi ile linki bulmaya calisiriz. Bizim link testimiz
    Addresses olup bunun bir kismini ornegin dresses ya da addr gibi alip bakabiliriz.

    linkText() yontemine benzer. Linkin birkac harfini bastan, ortadan ya da sondan alsak bile yeterli olur
    Hatta tam metni dahi partilaLinkText icin yazabiliriz.

    By.tagName();
    ----------------
    HTML koduna baktik. HTML kodunun tag'i input.

    WebElement passwordTextBox=driver.findElement(By.tagName("input");//unique olmadigi birden fazla sonuc
    elde edecegimiz zamnalarda findelements kullanilir.

    <div>,<a>,<input>, ... gibi bit tagi ilettiginizde, birden fazla ayni ad tagina sahip
    olabilecegimiz icin birden cok ogeyi dondurur.

    Cogunlukla ogelerin bir listesini almak icin kullanilir. Bu nedenle findElement degil findElements()
    yontemiyle kullanilmasi onerilir.Ayrica bir liste assign edilmelidir.
    Bir sayfadaki tum linkleri dondurmek icin By.tagName("a") kullanilabilir. Linklerin tagi "a"
    oldugu icin tagName parantezi icine "a" yazdik.

    WebElement elementName=driver.findElement(By.LacatorStrategy(ornek id, name, class name)("LacatorValue"));
Driver elementi bulmazsa, runtime exception verir. NoSuchElementException


    WebElement Methodlari:

    webElement.sendKeys("Metin"); Parametre olarak yazilan metni Web Elemente gonderir.

    webElement.sendKeys("Metin" + Keys.ENTER); Istedigimiz metni yollayip, sonra ENTER'a basar.

    webElement.submit(); Web element ile islem yaparken Enter tusuna basma gorevi yapar.

    findElements() Method

    List<WebElement> elementName=driver.findElements(By.LocatorStrategy("LocatorValue"));
    Bir liste assign ettik cunku birden fazla web element getirecek.

    Locator strategisiyle eslesen web elementi yoksa bos bir liste dondurur.

    findElement() unique olan tek bir elemani, findElements ise birden fazla webelementi verir

    findElement() NoSuchElementException firlatirken, findElements exception firlatmaz, bos bir liste
    dondurur.

        */

}
