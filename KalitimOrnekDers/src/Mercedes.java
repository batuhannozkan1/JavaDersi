
public class Mercedes {
    
    public String aracAdi;
    
    public String model;
    
    public int modelYili;
    
    public double fiyat;

     Mercedes() {
        System.out.println("Mercedes Yapici Metodu Calisti.");
    }
     
    
    
     void yakitTipi(){
                        
         System.out.println("Mercedes firmasinin benzinli , diesel"
                 + " ve elektirkli arac secenekleri mevcuttur.");
    }
    
    
     void motorHacmi(){
        
         System.out.println("Mercedes firmasinin 1.3,1.6,"
                 + "2.0,2.5,1.8, motor hacmine sahip"
                 + "arac secenekleri mevcuttur.");
    }
    
    
     double fiyatHesapla(){
        
        return fiyat*3;
    }
}
