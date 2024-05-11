
public class Kedi extends Hayvanlar{
    
    public String turu;

    public Kedi(String isim,String turu) {
        super(isim);
        this.turu = turu;
            }
    
    public void seslendir(){
        System.out.println(isim + "Adli kedi miyav miyav diye ses cikardi...");
    }
    
   
    
}
