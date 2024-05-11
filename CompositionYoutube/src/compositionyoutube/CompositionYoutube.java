
package compositionyoutube;


public class CompositionYoutube {

   
    public static void main(String[] args) {
        
    Ogrenci ogrenci = new Ogrenci("Batu","Ozkan","1665","mustafa","Mehmet","23.12.2001");
        
    OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri(ogrenci);
    
    ogrenciIslemleri.bilgileriGoster();
    ogrenciIslemleri.ogrenciSil();
    }
    
}
