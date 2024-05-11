
public class KrediTurleri {
    public String verilenKredi;
    String krediTuru;
    int vadeSayisi;
     double krediTutari;
     double faizOrani;
    
    
     KrediTurleri(double faizOrani){
        this.faizOrani = faizOrani;
    }
    
    
    public double odenecekTutar(){
        return (krediTutari + krediTutari*faizOrani)/vadeSayisi;
    }
    
    public void krediBilgileriniGoster(){
        System.out.println("Verilen Kredi : "+verilenKredi);
        System.out.println(" Kredi Turu : "+krediTuru);
        System.out.println("Vade Sayisi : "+vadeSayisi);
        System.out.println("Kredi Tutari : "+krediTutari);
        System.out.println("Kredi Faiz Orani : "+faizOrani);
        System.out.println("Odenecek Aylik Tutari : "+odenecekTutar());
                
    }
    
}
