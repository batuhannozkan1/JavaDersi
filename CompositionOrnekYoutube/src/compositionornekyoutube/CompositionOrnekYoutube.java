
package compositionornekyoutube;


public class CompositionOrnekYoutube {

    public static void main(String[] args) {
        
        Urun urun = new Urun("Canavar 12345DG","Bilgisayar",2400,12455,51);
        
        UrunYonetimi urunYonetimi = new UrunYonetimi(urun);
        
        urunYonetimi.urunEkle();
        urunYonetimi.urunGuncelle();
        urunYonetimi.urunSil();
    }
    
}
