
public class PastelBoyamaKitaplari extends BoyamaKitaplari{
    
    
    String yasAraligi;
    
    //double fiyat;
    
    PastelBoyamaKitaplari(){
        
        System.out.println("Pastel Boyama Kitaplari Yapicisi Calisti...");
    }
    

      void fiyatArtisiUygula(){
     
        System.out.println("%25 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.25;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(){
        
        System.out.println("%25 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.25;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
}
