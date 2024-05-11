
public class Scootish extends Kedi{
    
    public String renk;
    
    Scootish(String isim,String turu,String renk){
        super(isim,turu);
        this.renk = renk ;
    }
    
  public  void seslendir(){
        System.out.println(isim+"ince ince miyavladi...");
    }
}
