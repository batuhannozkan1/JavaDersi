
package abstractbankalarders;

public class YapiKredi extends PrivateBanks {
      boolean isKrediKarti;

     YapiKredi() {
    }

     YapiKredi(boolean isKrediKarti, String musteriAdi, String hesapTipi, boolean isMaasMusterisi) {
        super(musteriAdi, hesapTipi, isMaasMusterisi);
        this.isKrediKarti = isKrediKarti;
    }
      
      

    @Override
    void paraCek() {
        System.out.println("Yapikredi Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("Yapikredi Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("YapiKredi Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("Yapikredi Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("Yapikredi Bankasi Hesap Detay Bilgileri.");
        
    }
      
}
