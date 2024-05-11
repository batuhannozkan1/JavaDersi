
public abstract class Sekiller {
    
    private String renk;
    
    public int xKoordinat;
    
    public int yKoordinat;
    
    
    Sekiller(){
    
        
    }
    
    public abstract void Ciz();
    public abstract void Zoom();
    public abstract void Sil();
    public String getRenk(){
        return renk;
    }
    
    public void setRenk(String renk){
        this.renk =renk;
    }
    
    
    
    
        
    
    
    
    
}
