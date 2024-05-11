
public class Anakart {
    
    private String model;
    
    private String uretici;
    
    private int yuvaSayisi;
    
    private String isletimSistemi;
    
    public Anakart(String model,String uretici,int yuvaSayisi,String isletimSistemi){
        
        this.model = model;
        this.yuvaSayisi = yuvaSayisi;
        this.uretici = uretici;
        this.isletimSistemi = isletimSistemi;
        
        
    }

    
    public void isletimSistemiYukle(String isletimSistemi){
        this.isletimSistemi = isletimSistemi;
        
        System.out.println("İsletim sistemi yuklendi..."+isletimSistemi);
        
    }
            
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }
}
