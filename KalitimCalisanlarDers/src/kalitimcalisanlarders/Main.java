
package kalitimcalisanlarders;

 
public class Main {
    public static void main(String[] args) {
        
        KalitimCalisanlarDers c1 = new KalitimCalisanlarDers("Batu","Ozkan");
        
        c1.departman = "IT";
        c1.ekUcret = 2000;
        c1.yillikIzinSayisi = 10;
        c1.maas = 15000;
        c1.bilgileriYazdir();
        
        KalitimCalisanlarDers c2 = new  KalitimCalisanlarDers("Taha","Senel");
        
        c2.isim = "Talha";
        c2.soyIsim = "Senol";
        c2.bilgileriYazdir();
    }
}
