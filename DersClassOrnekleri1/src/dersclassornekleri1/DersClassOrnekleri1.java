
package dersclassornekleri1;

public class DersClassOrnekleri1 {

    public static void main(String[] args) {
     Araba araba1 = new Araba();
     araba1.marka = "Mercedes";
     araba1.model = "G500";
     araba1.modelYili =2023;
     araba1.kilometre = 5000;
     araba1.motorHacmi = 6000;
     araba1.renk = "Siyah";
     araba1.yakitTipi = "Dizel";
     araba1.calistir();
     araba1.bilgileriGoster();
    }
    
}
