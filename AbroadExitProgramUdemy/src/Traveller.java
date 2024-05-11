
import java.util.Scanner;


public class Traveller implements AbroadRules {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Traveller() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatirdiginiz Harc Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu ?");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        }
        
        else{
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizeniz bulunuyor mu ?");
        
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.vizeDurumu = true; 
        }
        else{
            this.vizeDurumu = false;
        }
        
    }
    
    
   
    
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc<15) {
            System.out.println("Lutfen yurtdisi cikis harcini tam yatirin");
           return false;
        }
        else{
            System.out.println("Yurtdisi harci islemi tamam!");
            return true;
        }
   
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor.Yurt disina cikamazsiniz...");
       return false;
        }
        else{
            System.out.println("Siyasi yasaginiz bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tamam!");
             return true;
        }
        else{
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadır.");
            return false;
        }
    }
    
}
