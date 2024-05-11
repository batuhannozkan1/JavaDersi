
public class TestSekiller {

  
    public static void main(String[] args) {

        // Sekiller s1 = new Sekiiler(); kullanılmaz.
        
        Cember c1 = new Cember();
        
        c1.Ciz();
        c1.Zoom();
        c1.Sil();
        
        Sekiller c2 = new Cember();
        // Data Type ile Constructor farklı isimde ise
           // 1. degisken -> ilk gördüğün yerde değer ata/al
           // 2. metot -> Constructor'un olduğu sınıfa kadar git
           //en son nerede override edilmişse onu çalıştır
           
           
           c2.Ciz();
           c2.Zoom();
           c2.Sil();
           
           
           Ucgen u1 = new Ucgen();
           u1.Ciz();
           u1.Zoom();
           u1.Sil();
            
           Sekiller u2 = new Ucgen();
           u2.Ciz();
           u2.Zoom();
           u2.Sil();

           
           Dikdortgen d1 = new Dikdortgen();
           d1.Ciz();
           d1.Zoom();
           d1.Sil();
           
           
           Sekiller d2 = new Dikdortgen();
           d2.Ciz();
           d2.Zoom();
           d2.Sil();
           
           
           // ------ ABSTRACT CLASSES ------------
    // Abstract bir sınıf tanımlanacak ise mutlaka 
        //abstract keyword kullanılmalıdır.
    // Abstract sınıf tip/şablon/iskelet/form/genel 
        //taslak oluşturmak için kullanılır.
    // Abstact sınıflar tek başına bir anlam ifade etmez!!! 
    // Kendinden türetilecek sınıflar için kullanılır.
    // Hiyerarşinin en üstünde bulunan sınıflar için kullanılır.
    // Kendinden nesne oluşturulumaz !!!
    // Kendinden örnek alınamaz/oluşturulamaz!!!
    // Abstract sınıflar hem concrete hem de abstract 
        //metotlara sahip olabilir.
    // Yapıcı Metotları (Consructor) ları vardır.

    // ------ ABSTRACT METHODS ------------
    // Abstract bir method tanımlanacak ise mutlaka 
        //abstract keyword kullanılmalıdır.
    // Abstract metotun gövdesi yoktur.
    // Abstract method tip/şablon/iskelet/form/genel taslak 
        //oluşturmak için kullanılır.
    // Abstact metotlar tek başına bir anlam ifade etmez!!! 
    // Mutlaka zorunlu polymorphism ile overridding edilmek zorundadır.
    // Abstract metotlar mutlaka abstract classlar içerisinde tanımlanmalıdır.
    // Yapıcı Metotları (Consructor) abstract olamaz!!!
    // Erişim belirteçleri kalıtım kuralları çerçevesinde 
        //public ya da protected olmalıdır.
    // static ve abstract metotlar bir arada kullanılmaz.
    // final anahtar kelimesiyle kullanılmaz
           
           
    }
    
}
