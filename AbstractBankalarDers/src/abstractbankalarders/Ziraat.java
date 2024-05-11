
package abstractbankalarders;


public class Ziraat extends StateBackedBanks {

    boolean isKrediKarti;

     Ziraat() {
    }

     Ziraat(boolean isKrediKarti, String musteriAd, String hesapTipi, boolean isMaasMusteri) {
        super(musteriAd, hesapTipi, isMaasMusteri);
        this.isKrediKarti = isKrediKarti;
    }
    
    
    
     @Override
    void paraCek() {
        System.out.println("Ziraat Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("Ziraat Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("Ziraat Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("Ziraat Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("Ziraat Bankasi Hesap Detay Bilgileri.");
        
    }
  void durumGor(){
        System.out.println("Devlet destekli bankalar"
                + "Ziraat class icerisinde calisti.");
    }
    

}
