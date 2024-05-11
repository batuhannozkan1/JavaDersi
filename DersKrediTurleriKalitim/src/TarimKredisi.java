
public class TarimKredisi extends KrediTurleri {
    String verilicekAlani;
    
     TarimKredisi(double krediTutari,int vadeSayisi,double faizOrani){
         super(faizOrani);
        this.krediTutari = krediTutari;
        this.vadeSayisi = vadeSayisi;
        
    }
}
