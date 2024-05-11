
package compositionornekyoutube;


public class UrunYonetimi {
  public Urun urun;


    public UrunYonetimi(Urun urun) {
        this.urun = urun;
    }
    
    public void urunEkle(){
        System.out.println("Urun eklendi : "+urun.isim);
    }
    
    public void urunGuncelle(){
        System.out.println("Urun guncellendi : "+urun.kategori);
    }
    
    public void urunSil(){
        
        System.out.println("Urun silindi : "+urun.stok);
    }
    
    
    
    
    
}
