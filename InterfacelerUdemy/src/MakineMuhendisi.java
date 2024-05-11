
public class MakineMuhendisi implements ICalisma,IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void calis() {
        System.out.println("Makine Muhendisi Calisiyor.");
    }

    @Override
    public void askerlikDurumuSorgula() {
          
        if (askerlik) {
            
            System.out.println("Askerliğimi Yaptım.");
            
        }
        else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam : "+derece;
    }

    @Override
    public void adliSicilSorgula() {
          if (adliSicil) {
            System.out.println("Adli Sicil Kaydım Bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
            
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
