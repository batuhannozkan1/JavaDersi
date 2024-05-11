
public class Main {
    public static void main(String[] args) {
        
        // Object Oriented Yönelimli  Atm Programı.
        
        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.
        
        // Hesap Class'ı Hesap İşlemlerini Yapacak.
        
        // ATM ise ATMmiz'i Çalıştırıcak.
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Batuhan Yasar","12345",10000);
        
        atm.calis(hesap);
        System.out.println("Programdan Cikiliyor...");
        
    }
}
