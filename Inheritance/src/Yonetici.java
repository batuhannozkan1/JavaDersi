
public class Yonetici extends Calisan {//Subclass

    
    private int sorumluKisi;//Ekstra Özellik
    
    public Yonetici(String isim,int maas,String departman,int sorumluKisi){
        super(isim, maas, departman);
        
        this.sorumluKisi = sorumluKisi;
        
    }
    
    public void zamYap(int zamMiktari){
        System.out.println("Calisanlara "+zamMiktari+" TL zam yapildi");
        this.maas +=zamMiktari;
        System.out.println("Yeni Maas : "+this.maas);
    }
    
    
    
    public void bilgileriGoster(){
        super.bilgileriGoster();
          
        /*System.out.println("İsim :" + getIsim());
        System.out.println("Maaş :" + getMaas());
        System.out.println("Departman :" + getDepartman());*/
        
        System.out.println("Sorumlu Kisi Sayisi: "+this.sorumluKisi);
    }
    
}
