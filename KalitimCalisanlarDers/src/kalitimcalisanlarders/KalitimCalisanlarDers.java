
package kalitimcalisanlarders;


public class KalitimCalisanlarDers {
    
    public String isim;
    public String soyIsim;
    public String departman;
    public int yillikIzinSayisi;
    public double ekUcret;
    public double maas;

    public KalitimCalisanlarDers(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        System.out.println("Parametresiz yapici metot calisti...");

    }
    
    KalitimCalisanlarDers(){
        System.out.println("Parametresiz yapici metot calisti...");
    }
    
    
    
    public double maasHesapla(){
        
        return ekUcret + maas+ yillikIzinSayisi*500;
    }
    
    public void bilgileriYazdir(){
        
        System.out.println("******************************************");
        System.out.println("Calisan Adi : "+isim);
        System.out.println("Calisan soy adi : "+soyIsim);
        System.out.println("Calisan departman : "+departman);
        System.out.println("Calisan yillik izin sayisi : "+yillikIzinSayisi);
        System.out.println("Calisan maas : "+maas);
        System.out.println("Calisan ekUcret : "+ekUcret);
        System.out.println("Calisan net maas : "+maasHesapla());
        System.out.println("******************************************");
        
                
        
    }
    
    
    
    
    
    

    
   
    
}
