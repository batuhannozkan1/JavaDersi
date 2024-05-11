
public class Kitaplar {
    public String adi ;
    private String yazari;
    private String basimYili;
    protected int sayfaSayisi;
    double Isbn;
    double fiyat;
    
    
    Kitaplar(){
        System.out.println("Kitaplar yapicisi calisti...");
                
    }
    
    double fiyatHesapla (double fiyat){
        //KDV %40
        return fiyat*1.4;
    }
    
     double fiyatHesapla (){
        //KDV %40
        return fiyat*1.4;
    }
    
    void fiyatArtisiUygula(){
     
        System.out.println("%5 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.05;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(){
        
        System.out.println("%5 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.05;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
    
    
    
    
}
