
package abstractbankalarders;


public class VakifKatilim extends VakifBank {
    
    boolean isKrediKarti;
    boolean isEskiMusteri;
    
    VakifKatilim() {
    }

    VakifKatilim( String musteriAd, String hesapTipi, boolean isMaasMusteri,boolean isKrediKarti, boolean isEskiMusteri) {
        super(isKrediKarti, musteriAd, hesapTipi, isMaasMusteri);
        this.isKrediKarti = isKrediKarti;
        this.isEskiMusteri = isEskiMusteri;
    }
    
     
    void durumGor(){
        
        System.out.println("Devlet destekli bankalar"
                + "VakifKatilim class icerisinde calisti.");
    
    }

}
