
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamiza Hosgeldiniz...");
        
        System.out.println("*************************************");
        System.out.println("Kullanici Girisi");
        System.out.println("*************************************");
        
        int girisHakki=3;
        
        while (true) {            
            if (login.login(hesap)) {
                System.out.println("Giris Basarili...");
                break;
            }
            else{
                System.out.println("Giris Basarisiz...");
                girisHakki--;
                System.out.println("Kalan Giris Hakki : "+girisHakki);
            }
            if (girisHakki==0) {
                System.out.println("Giris Hakkiniz Bitti...");
            }
        }
        
    }
    
    
}
