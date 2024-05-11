
package abstractbankalarders;


public class Garanti extends PrivateBanks {
    
    boolean isKrediKarti;

     Garanti() {
    }

     Garanti(boolean isKrediKarti, String musteriAdi, String hesapTipi, boolean isMaasMusterisi) {
        super(musteriAdi, hesapTipi, isMaasMusterisi);
        this.isKrediKarti = isKrediKarti;
    }
    
     
    

    @Override
    void paraCek() {
        System.out.println("Garanti Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("Garanti Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("Garanti Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("Garanti Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("Garanti Bankasi Hesap Detay Bilgileri.");
        
    }
    
}
