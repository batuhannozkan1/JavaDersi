
package abstractbankalarders;


public abstract class StateBackedBanks extends Banks {
    
    boolean isMaasMusteri;
    
    StateBackedBanks(){
        
    }
    
    
    StateBackedBanks(String musteriAd,String hesapTipi,boolean isMaasMusteri){
        super(musteriAd, hesapTipi);
        this.isMaasMusteri = isMaasMusteri;
    }
    
    
    abstract void paraCek();
    abstract void paraYatir();
    
    void durumGor(){
        System.out.println("Devlet destekli bankalar"
                + "Abstract class icerisinde calisti.");
    }
    
}
