
public class CocukKitaplari extends Kitaplar {
    
    
    String yasAraligi;
    
    CocukKitaplari(){
        
        System.out.println("Cocuk Kitaplari Yapicisi Calisti...");
    }
    
      void fiyatArtisiUygula(){
     
        System.out.println("%15 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.15;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(){
        
        System.out.println("%15 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.15;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
    
    
   
}
