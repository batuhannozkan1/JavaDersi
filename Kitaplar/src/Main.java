
public class Main {
    public static void main(String[] args) {
        Kitaplar k1 =new Kitaplar();
        k1.kitapAdi = "Kitap-1";
        k1.yazar =" Yazar-1"; 
        k1.ISBN = 123456789;
        k1.kitapSec();
        
        BasiliKitaplar bk1 = new BasiliKitaplar();
        bk1.kitapAdi ="Basili Kitap-2";// Kitaplar Super Class
        bk1.yazar = "Basili Kitap Yazar-2";// Kitaplar Super Class
        bk1.ISBN = 1234567890;//Kitaplar Super Class Member
        bk1.ciltKapagi = "Karton Kapak";// Own Class Member
        bk1.kitapSec();//Kitaplar Super Class Members
        
        
        EKitaplar ek1 = new EKitaplar();//
        ek1.kitapAdi = "E Kitap -3";
        ek1.yazar = "E Kitap Yazar-3 ";
        ek1.ISBN =1234567890;
        ek1.orjinalMi = true;
        ek1.kitapSec();
        
        
        SesliKitaplar sk1 = new SesliKitaplar();
        sk1.kitapAdi = "Sesli Kitap-4";
        sk1.yazar = "Sesli Kitap Yazar-4";
        sk1.seslendiren = "Seslendirme -4";
        sk1.ISBN = 1234567890;
        sk1.kitapSec();
        
        
        UniversiteKitaplari uk1 = new UniversiteKitaplari();
        uk1.kitapAdi =" Universite Kitap-5";
        uk1.yazar = "Universite Kitap Yazar -5";
        uk1.ISBN = 1234567890;
        uk1.ciltKapagi = "Karton";
        uk1.cevirmen = " Universite Kitap Cevirmen -5";
        uk1.kitapSec();
        uk1.cevir();
        
        
        IngilizceKitaplari ik1 = new IngilizceKitaplari();
        ik1.kitapAdi = " İngizilice Yazar-6";
        ik1.ISBN = 123456789;
        ik1.kitapAdi = "İngilizce Kitap Yazar-6";
        ik1.ciltKapagi = "Karton";
        ik1.alistirmaVarMi = true;
        ik1.kitapSec();
        ik1.cevir();
    }
  
}
