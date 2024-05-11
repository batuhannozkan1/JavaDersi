
package interfaceornek2ders;


public class CocukKitaplari extends Kitaplar implements IBaskiAl,ISeslendir {

    @Override
    void Kitapİnfo() {
       
         System.out.println("Kitap Adi : "+Adi);
        System.out.println("Kitap Yazari : "+yazari);
        System.out.println("Bu kitap Cocuk Kitabidir.");
        
    }

    @Override
    public void seslendir() {
        System.out.println("Cocuk Kitap Seslendirildi");
    }

    @Override
    public void boyut() {
        System.out.println("Cocuk Kitaplari seslendirildi.Boyut 500MB");
    }
    
}
