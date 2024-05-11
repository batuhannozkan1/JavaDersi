
public class PcMuhendisi implements IMuhendis {
    
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerligimi yaptim.");
        }
        
        else{
            System.out.println("Askerligimi yapmadim.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : "+derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydim bulunuyor.");
        }
        else{
            System.out.println("Adli sicil kaydim bulunmuyor.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
