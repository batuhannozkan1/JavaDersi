
public class IhtiyacKredisi extends KrediTurleri {
  public String durum;
    
    
     IhtiyacKredisi(double faizOrani,double krediTutari,int vadeSayisi){
        super(faizOrani);
        this.krediTutari = krediTutari;
        this.vadeSayisi = vadeSayisi;
    }
}
