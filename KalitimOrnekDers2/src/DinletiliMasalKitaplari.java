
public class DinletiliMasalKitaplari extends MasalKitaplari {
    
    
    String yasAraligi ;
    double fiyat;
    
    DinletiliMasalKitaplari(){
        System.out.println("Dinletili Masal Kitaplari Yapicisi Calisti...");
    }
    
    
    void fiyatArtisiUygula(double fiyat){
     
        System.out.println("%30 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.3;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(double fiyat){
        
        System.out.println("%30 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.3;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
}
