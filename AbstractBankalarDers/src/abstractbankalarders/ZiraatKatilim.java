
package abstractbankalarders;



public class ZiraatKatilim extends Ziraat {
    
    boolean isKrediKarti;
    boolean isEskiMusteri;

     ZiraatKatilim() {
    }

     ZiraatKatilim( String musteriAd, String hesapTipi, boolean isMaasMusteri,boolean isKrediKarti, boolean isEskiMusteri) {
        super(isKrediKarti, musteriAd, hesapTipi, isMaasMusteri);
        this.isKrediKarti = isKrediKarti;
        this.isEskiMusteri = isEskiMusteri;
    }

    
      @Override
    void paraCek() {
        System.out.println("ZiraatKatilim Bankasindan Para Cekildi.");
    }

    @Override
    void paraYatir() {
       System.out.println("ZiraatKatilim Bankasina Para Girisi Oldu.");

    }

    @Override
    void krediCek() {
       System.out.println("ZiraatKatilim Bankasindan Kredi Cekildi.");

    }

    @Override
    void birikimYap() {
        System.out.println("ZiraatKatilim Bankasi Birikim Hesabi Calisti.");
        
    }

    @Override
    void info() {
        System.out.println("ZiraatKatilim Bankasi Hesap Detay Bilgileri.");
        
    }
    
    void durumGor(){
        
        System.out.println("Devlet destekli bankalar"
                + "ZiraatKatilim class icerisinde calisti.");
    
    }

    
   
}
