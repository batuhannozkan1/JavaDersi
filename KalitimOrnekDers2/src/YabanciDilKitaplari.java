
public class YabanciDilKitaplari extends Kitaplar {
    
    
    boolean isExercise;
    //double fiyat;
    
    YabanciDilKitaplari(){
        System.out.println("Yabanci Dil Kitaplari Yapicisi Calisti...");
    }
    
    
     void fiyatArtisiUygula(){
     
        System.out.println("%20 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.2;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(){
        
        System.out.println("%20 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.2;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
    
}
