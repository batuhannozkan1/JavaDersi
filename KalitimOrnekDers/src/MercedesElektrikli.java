
public class MercedesElektrikli extends Mercedes{
    
    
    
   public double fiyat;

     MercedesElektrikli() {
         System.out.println(" Mercedes Benzinli Yapici Metodu Olustu...");
    }
    
    
    public void yakitTipi(){
         System.out.println("Mercedes firmasinin "
                 + " elektirkli arac secenekleri mevcuttur.");
        
    }
    
    
    public void motorHacmi(){
        
         System.out.println("Mercedes firmasinin 1.3,1.6,"
                 + "2.0,2.5,1.8, motor hacmine sahip"
                 + "arac secenekleri mevcuttur.");
       
    }
    
    
    public double fiyatHesapla(){
        // kdv %200 + ötv %50
        return fiyat*2 + fiyat*1.5;
    }
}
