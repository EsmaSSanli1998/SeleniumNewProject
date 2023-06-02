package techproed.day04_Locators;

public class HTMLNot {
    /*
    Tag nedir?
    HTML komutlarına tag denir ve <> işaretinin arasına yazılır.

    Inceledigimiz HTML kodunda div, table, tbody taglarini ustten alta dogru sirali halde gorduk.Parent olanlar
    ustte, child'lar kendi parent'larinin altinda siralanmis.
    td taglari ise ayni hizada alt alta sirali idi ve td taglari birbirinin kardesleridir.

    Tags: < > şeklinde görülen komutlara etiket (tag) adı verilir.
    parent-child-sibling relationship(Ebeveyn-çocuk-kardeş ilişkisi) hakkında konuştuğumuzda, yalnızca tag adları önemlidir
    <table>, <div> in çocuğudur(child) ve <tbody>, <tr> in ebeveyndir (parent)
    <td> taglari ise siblings (kardes)'dir

    --neden div baslangıç değil bodyden başladık
    --kisaltmak icinmis

     Absolute xpath:

     Bizim nereden baslayacagimiz tamamen inceledigimiz HTML koduna bagli olup, ilgili webelement icin en tepesindeki parent tagi neyse onunla baslariz. bastaki tag oncesinde // koyariz ve sonrasinda her tag arasina
     bir slash / isareti koyariz.
     Absolute xpath yazmak icin en basa // sonraki her adimda / yazarak hedef web element'e kadar tum
     tag'lar yazilir.
     Eger ayni path'e sahip birden fazla element varsa index kullanilabilir. [2] gibi
     Eger bir parent'in grand child'lari icinde unique bir tag varsa parent // grand child yazilabilir
     // div/ table/ tbody  Bizim ulasmak istedigimiz tbody ise div ile basliyoruz, sonra gelen table ve tbody'e
     geldik inceledigimiz HTML kodunda
     // tbody / tr / td[3] // span //HTML kodunda 3 tane sirasiyla td tagi vardi bu nedenle td[3] yazildi
     td tagi altinda bir a tagi vardi onu atlamak isteyince onu yazmadan // yaziyoruz
     // tbody / tr / td[3] / a / span

     */
}
