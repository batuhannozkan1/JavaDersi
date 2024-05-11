
package abstractbankalarders;


public abstract class PrivateBanks extends Banks {
    boolean isMaasMusterisi;

    public PrivateBanks() {
    }
    
    public PrivateBanks(String musteriAdi, String hesapTipi, boolean isMaasMusterisi) {
        
        super(musteriAdi,hesapTipi);
        
        this.isMaasMusterisi = isMaasMusterisi;
    }
    
    abstract void paraCek();
    abstract void paraYatir();
    
    
    
    
    
}
