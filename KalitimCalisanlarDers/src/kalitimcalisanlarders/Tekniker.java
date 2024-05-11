
package kalitimcalisanlarders;


public class Tekniker extends TeknikPersonel{
    
    public double mesai;

    public Tekniker( String isim, String soyIsim, double gorevlendirmeUcreti,double mesai) {
        super(isim, soyIsim, gorevlendirmeUcreti);
        this.mesai = mesai;
    }
    
    
    public double mesaiUcretHesapla(){
        
        return mesai+maasHesapla();
    }
    
    
    
}
