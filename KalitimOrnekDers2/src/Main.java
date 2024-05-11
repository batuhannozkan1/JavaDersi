
public class Main {
    
    public static void main(String[] args) {
    
        BoyamaKitaplari bk1 = new BoyamaKitaplari();
        bk1.adi = "Batu";
        bk1.Isbn = 134567;
        bk1.fiyat = 100000;
        bk1.sayfaSayisi = 3000;
        bk1.yasAraligi = "15-20";
        bk1.turu = "Boyama";
        bk1.fiyatArtisiUygula();
        bk1.fiyatHesapla();
        bk1.fiyatIndirimiUygula();
        
        
        System.out.println("**********************************************");
        
        CocukKitaplari ck1 = new CocukKitaplari();
        ck1.adi = "At";
        ck1.Isbn = 134567;
        ck1.fiyat = 100000;
        ck1.sayfaSayisi = 3000;
        ck1.yasAraligi = "15-20";
        ck1.fiyatArtisiUygula();
        ck1.fiyatHesapla(ck1.fiyat);// parametreli olan calisti...
        ck1.fiyatIndirimiUygula();
        
       System.out.println("**********************************************");

        
        
        DinletiliMasalKitaplari dmk1 = new DinletiliMasalKitaplari();
        dmk1.adi = "Esek";
        dmk1.Isbn = 134567;
        dmk1.fiyat = 100000;
        dmk1.sayfaSayisi = 3000;
        dmk1.yasAraligi = "15-20";
        dmk1.fiyatArtisiUygula();
        dmk1.fiyatHesapla();
        dmk1.fiyatIndirimiUygula();
     
        System.out.println("**********************************************");

        
        
        
        Kitaplar k1 = new Kitaplar();
        k1.adi = "Kopek";
        k1.Isbn = 134567;
        k1.fiyat = 100000;
        k1.sayfaSayisi = 3000;
        k1.fiyatArtisiUygula();
        k1.fiyatHesapla();
        k1.fiyatIndirimiUygula();
        
        
      System.out.println("**********************************************");

        
        
        
        
        MasalKitaplari mk1 = new MasalKitaplari();
        mk1.adi = "Kedi";
        mk1.Isbn = 134567;
        mk1.fiyat = 100000;
        mk1.sayfaSayisi = 3000;
        mk1.yasAraligi = "15-20";
        mk1.fiyatArtisiUygula();
        mk1.fiyatHesapla();
        mk1.fiyatIndirimiUygula();
        
        
     System.out.println("**********************************************");

        
        
        
        PastelBoyamaKitaplari pbk1 = new PastelBoyamaKitaplari();
        pbk1.adi = "Aslan";
        pbk1.Isbn = 134567;
        pbk1.fiyat = 100000;
        pbk1.sayfaSayisi = 3000;
        pbk1.yasAraligi = "15-20";
        pbk1.turu = "Boyama";
        pbk1.fiyatArtisiUygula();
        pbk1.fiyatHesapla();
        pbk1.fiyatIndirimiUygula();
        
        
     System.out.println("**********************************************");
  
        UniversiteKitaplari uk1 = new UniversiteKitaplari();
        uk1.adi = "Tilki";
        uk1.Isbn = 134567;
        uk1.fiyat = 100000;
        uk1.sayfaSayisi = 3000;
        uk1.fiyatArtisiUygula();
        uk1.fiyatHesapla();
        uk1.fiyatIndirimiUygula();
        
     System.out.println("**********************************************");
 
        YabanciDilKitaplari ydk1 = new YabanciDilKitaplari();
        ydk1.adi = "Horse";
        ydk1.Isbn = 134567;
        ydk1.fiyat = 100000;
        ydk1.sayfaSayisi = 3000;
        ydk1.fiyatArtisiUygula();
        ydk1.fiyatHesapla();
        ydk1.fiyatIndirimiUygula();
        
    System.out.println("**********************************************");
   
        
                
        
        
        
    }
    
}
