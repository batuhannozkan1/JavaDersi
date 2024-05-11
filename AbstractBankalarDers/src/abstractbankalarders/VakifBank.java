
package abstractbankalarders;


public class VakifBank extends StateBackedBanks {
        boolean isKrediKarti;

    
     VakifBank() {
    }

     VakifBank(boolean isKrediKarti, String musteriAd, String hesapTipi, boolean isMaasMusteri) {
        super(musteriAd, hesapTipi, isMaasMusteri);
        this.isKrediKarti = isKrediKarti;
    }
    
     
     @Override
    void paraCek() {
        System.out.println("VakifBank Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("VakifBank Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("VakifBank Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("VakifBank Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("VakifBank Bankasi Hesap Detay Bilgileri.");
        
    }
    
}
