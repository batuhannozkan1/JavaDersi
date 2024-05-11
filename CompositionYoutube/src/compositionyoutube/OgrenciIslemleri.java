
package compositionyoutube;


public class OgrenciIslemleri {
    public Ogrenci ogrenci;

    public OgrenciIslemleri(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    public void ogrenciEkle(){
        System.out.println("Ogrenci eklendi : "+ogrenci.ad);
    }
    
    public void ogrenciSil(){
        System.out.println("Ogrenci silindi : "+ogrenci.ad);
    }
    
    public void bilgileriGoster(){
        
        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.anaAdi);
        System.out.println(ogrenci.soyAd);
        System.out.println(ogrenci.dogumTarihi);
        System.out.println(ogrenci.no);
        
    }

   
    
}
