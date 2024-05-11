
public class TestMain {

    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz...");

        String sartlar = "Yurtdisi Cikis Kurallari...\n"
                + "Herhangi bir siyasi yasaginiz bulunmamasi gerekiyor...\n"
                + "15 TL harc bedelinizi tam olarak yatirmaniz gerekiyor...\n"
                + "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...\n";
               
        String message =  "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor...";
        
        
        while (true) {            
            System.out.println("*******************************");
            System.out.println(sartlar);
            System.out.println("*******************************");
            
            Traveller traveller = new Traveller();
            
            System.out.println("Harc bedeli kontrol ediliyor...");
            
            Thread.sleep(3000);
            
            if (traveller.yurtDisiHarciKontrol()==false) {
                System.out.println(message);
                continue;//basa dön while
                       
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if (traveller.siyasiYasakKontrol()==false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if (traveller.vizeDurumuKontrol()==false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("İslemleriniz Tamam! Yurtdisina cikabilirsiniz.");
            break;
        }
                

    }
    
}
