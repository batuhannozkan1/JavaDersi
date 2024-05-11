
public class MercedesTamElektrikli extends MercedesElektrikli{
   public double fiyat;

     MercedesTamElektrikli() {
         System.out.println(" Mercedes Benzinli Yapici Metodu Olustu...");
    }
    
    
    public void yakitTipi(){
         System.out.println("Mercedes firmasinin "
                 + " tam elektirkli arac secenekleri mevcuttur.");
        
    }
    
    
    public void motorHacmi(){
        
         System.out.println("Mercedes firmasinin 2.5"
                 + "2.0,2.5,1.8, motor hacmine sahip"
                 + "arac secenekleri mevcuttur.");
       
    }
    
    
    public double fiyatHesapla(){
        // kdv %200 + ötv %30
        return fiyat*2 + fiyat*1.3;
    }
}
