
package interfaceornek2ders;

public abstract class Kitaplar implements IBaskiAl {
    
    
    String Adi;
    String ISBN;
    String yazari;
    double fiyati;
    String basimYili;

     Kitaplar() {
    }

    public Kitaplar(String Adi, String ISBN, String yazari, double fiyati, String basimYili) {
        this.Adi = Adi;
        this.ISBN = ISBN;
        this.yazari = yazari;
        this.fiyati = fiyati;
        this.basimYili = basimYili;
    }
    
     
     abstract void Kitapİnfo();
    
    
}
