
package kalitimornek;


public class KalitimOrnek {

  
    public static void main(String[] args) {
        
       /* Kopek k1 = new Kopek();
        
        k1.isim = "Karabaş";
        k1.egitimVer();*/
       
      /* Koyun koyun =new Koyun();
       
       koyun.renk = "Kirmizi";
       koyun.kirp();*/
      
     /* At at = new At();
      at.bacakBoyu = 130;
      at.asiYap();
      at.suVer();*/
     
     Kopek kopek = new Kopek();
     Koyun koyun = new Koyun();
     At at = new At();
     Hayvan hayvan = new Hayvan();
     
     kopek.yemekVer();
     koyun.yemekVer();
     at.yemekVer();
        System.out.println("---------------------------------");
     kopek.asiYap();
        System.out.println("----------------------------------");
     koyun.asiYap();
    }
    
}
