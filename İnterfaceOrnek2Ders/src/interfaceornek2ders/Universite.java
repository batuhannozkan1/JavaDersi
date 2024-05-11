
package interfaceornek2ders;


public class Universite extends Kitaplar implements IBaskiAl,IEKitapOlustur {

    @Override
    void Kitapİnfo() {
        System.out.println("Kitap Adi : "+Adi);
        System.out.println("Kitap Yazari : "+yazari);
        System.out.println("Bu kitap Roman Kitabidir.");

    }

  
    public void baskiAl() {
        System.out.println("Universite Kitap Kategorisinden Kitap Alindi.");
    }

    @Override
    public void EKitapOlustur() {
        System.out.println("Universite Kitap Kategorisinden EKitap olusturuldu.");

    }

    @Override
    public void formatAl() {
        System.out.println("Universite Kitap .pdf formatinda hazirlandi.");

    }
    
    
    
}
