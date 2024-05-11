
package abstractbankalarders;

public class HalkBank extends StateBackedBanks {
    boolean isKrediKarti;

     HalkBank() {
    }

    public HalkBank(boolean isKrediKarti, String musteriAd, String hesapTipi, boolean isMaasMusteri) {
        super(musteriAd, hesapTipi, isMaasMusteri);
        this.isKrediKarti = isKrediKarti;
    }
    
     
     @Override
    void paraCek() {
        System.out.println("Halkbank Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("Halkbank Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("Halkbank Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("Halkbank Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("Halkbank Bankasi Hesap Detay Bilgileri.");
        
    }
}
