
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 100;
        int b = 20;
        int sonuc = 0;

        String metin = "inspimo";

        int[] dizi = new int[5];

        try {
            sonuc = a / b;
            System.out.println("" + metin.charAt(sonuc));
            System.out.println("" + dizi[4]);
            int sayi = scanner.nextInt();
            System.out.println("try tamamlandı...");
        } catch (ArithmeticException e) {
            System.out.println("Hata !" + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        }
        catch(NullPointerException e) {
            System.out.println("Hata ! " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Hata ! String : " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
            
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata ! Array Index Out! : " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Hata ! Index Out! : " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        }
        catch (IllegalArgumentException e){
            System.out.println("Hata Illegal Veri Tipi Hatasi ! " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        } 
        
        catch (Exception e){
            System.out.println("Hata ! " + e.getMessage());
            System.out.println("Hata ! " + e.getStackTrace());
            System.out.println("Hata ! " + e.toString());
        } catch (StackOverflowError e) {
            System.out.println("TASMA HATASI : " + e.getMessage());
        } catch (VirtualMachineError e) {
            System.out.println("HATA ! : " + e.getMessage());
        } catch (Error e) {
            System.out.println("HATA ! : " + e.getMessage());
        } finally {
            System.out.println("The program must go on!");// program devam etmeli
        }
        
        System.out.println("Sonuc : " + sonuc);
        
    }

}
