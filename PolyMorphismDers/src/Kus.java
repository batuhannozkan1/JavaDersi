
public class Kus extends Hayvanlar{
  
    public String family;
    
    Kus(String isim,String family){
        super(isim);
        this.family = family;
    }
    
    public void selendir(){
        System.out.println(isim +" adli kus cik cik diye ses cikariyor...");
        
    }
}
