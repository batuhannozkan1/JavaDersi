
public class Hayvanlar {
    
    public String isim;
    public int omur;
    
    Hayvanlar(String isim){
        this.isim = isim;
    }
    
    public void seslendir(){
        System.out.println(isim+"adli hayvan tanimlanamayan bir ses cikariyor...");
        
    }
}
