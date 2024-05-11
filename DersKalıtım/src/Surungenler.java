
public class Surungenler extends Hayvan {
    
    public String rengi;
    public boolean omurgasiVarMi;
    
    public void zararVermeFonksiyonu(){
        if (omurgasiVarMi) {
            System.out.println(turu+" den "
                + rengi+" renkli "
                       +ad + "adli surungen zarar verebilir.");
        }
        else{
            System.out.println(turu+" den "
                + rengi+" renkli "
                                +ad+ "zararsizdir.");
            
        }
    }
    
    public void bolunebilmeYetenegi(){
        if (omurgasiVarMi) {
              System.out.println(turu+" den "
                + rengi+" renkli "
                                +ad+ "bolunemez.");
            
        }
        else{
              System.out.println(turu+" den "
                + rengi+" renkli "
                                +ad+ "bolunebilir.");
            
            
        }
        
    }
}
