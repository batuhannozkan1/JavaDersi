
import java.util.Scanner;

class siyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasaginiz Bulunuyor...");
    }
}

class vizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz Vizeniz Bulunmamaktadir...");
    }
}

class harcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Lutfen Yurtdisi Harcini Tam Yatirin...");
    }
}



public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatirdiginiz Harc Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasaginiz bulunuyor mu? ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu ?");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }
    }

    public void siyasiYasakKontrol() throws siyasiException {
        if (siyasiYasak==true) {
            throw new siyasiException();
        }
    }

    public void yurtdisiHarciKontrol() throws harcException {
 
        if (this.harc<15) {
            throw new harcException();
        }
        else{
            System.out.println("Yurtdisi islemleri tamam!");
        }
    }

    public void vizeDurumuKontrol() throws vizeException {
        if (vizeDurumu==false) {
            throw new vizeException();
        }
        else{
            System.out.println("Vize islemleri tamam!");
        }
    }

}
