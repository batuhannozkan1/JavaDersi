
package interfaceornek2ders;


public class Roman extends Kitaplar implements IBaskiAl,IEKitapOlustur,ISeslendir {

    @Override
    void Kitapİnfo() {
       System.out.println("Kitap Adi : "+Adi);
        System.out.println("Kitap Yazari : "+yazari);
        System.out.println("Bu kitap Roman Kitabidir.");
    }

  
    public void baskiAl() {
System.out.println("Roman Kitap Kategorisinden Kitap Alindi.");
    }

    @Override
    public void EKitapOlustur() {
 System.out.println("Roman Kitap Kategorisinden EKitap olusturuldu.");
    }

    @Override
    public void formatAl() {
System.out.println("Roman Kitap .pdf formatinda hazirlandi.");
    }

    @Override
    public void seslendir() {
  System.out.println("Roman Kitap Seslendirildi");
    }

    @Override
    public void boyut() {
System.out.println("Roman Kitaplari seslendirildi.Boyut 500MB");
    }
    
}
