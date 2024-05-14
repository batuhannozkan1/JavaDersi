
import java.awt.BorderLayout;
import java.util.Scanner;


public class Main {
    
    public static void mekanKontrol(int yas){
        
        if (yas<18) {
            throw new ArithmeticException();
        }
        else{
            System.out.println("Mekana Hosgeldiniz...");
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen yasinizi giriniz : ");

        int yas = scanner.nextInt();
        try{
            
            mekanKontrol(yas);
        
        }
        catch(ArithmeticException e){
            
            System.out.println("18 yasindan kucukler giremez.");
       
                    
                    }
        
        
        
        
        }
        
    
}
