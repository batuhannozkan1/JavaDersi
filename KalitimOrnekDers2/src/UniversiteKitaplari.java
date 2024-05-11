
public class UniversiteKitaplari extends Kitaplar{
    
    
    boolean isOrjinal ;
  // double fiyat;
    
    UniversiteKitaplari(){
        
        System.out.println("Universite Kitaplari yapicisi calisti...");
    }
    
  
    void fiyatArtisiUygula(){
     
        System.out.println("%10 fiyat artisi uygulandi ");
        
        fiyat = fiyat + fiyat*0.1;
        System.out.println("Guncel Fiyat : "+fiyat);
                
  
    }
    
    
     void fiyatIndirimiUygula(){
        
        System.out.println("%10 fiyat indirimi uygulandi ");
        
        fiyat = fiyat - fiyat*0.1;
        System.out.println("Guncel Fiyat : "+fiyat);
                
    }
    
}
