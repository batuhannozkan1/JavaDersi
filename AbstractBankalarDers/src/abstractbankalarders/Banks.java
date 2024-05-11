/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractbankalarders;

/**
 *
 * @author by101
 */
public abstract class Banks {
    //abstract zorunlu override constructor vardır obje ve gövdesi yoktur.
    //abstract class abstract olmayan metotlarada sahip olabilir.
    int musteriHesapNo;
    String musteriAdi;
    String hesapTipi;
    String adres;
    String iletisim;
    double bakiye;

     Banks() {
   
    }
     
     Banks(String musteriAd,String hesapTipi){
         this.musteriAdi = musteriAdi;
         this.hesapTipi = hesapTipi;
     }
     
     abstract void krediCek();
     abstract void birikimYap();
     abstract void info();

     void info (String mesaj){
         System.out.println("-----------------------");
         System.out.println("Musteri hesap no : "+ musteriHesapNo);
         System.out.println("Musteri adi : "+musteriAdi);
         System.out.println("Hesap tipi : "+hesapTipi);
         System.out.println("Adres bilgileri : "+adres);
         System.out.println("Iletisim bilgileri : "+iletisim);
         System.out.println("Hesap bakiye : "+bakiye);
         System.out.println("Hesap detay : "+mesaj);
         
         
         
     }
    
    
    
    
    
}


