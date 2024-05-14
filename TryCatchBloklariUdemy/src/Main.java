
public class Main {


    public static void main(String[] args) {

        /*try {
            
            // Exception Oluşturabilecek Kodlar
            
        } catch (Exception_Turu e) {
            //Exception Durumunda Yapılacak İşlemler
            
        }*/
        
        
        
       // int a = 30/0; //Unchecked Exception
        //int [] b ={1,2,3,4,5};
        
       // System.out.println(b[6]);
        
       // System.out.println("Burasi Calisiyor...");
        
       
        try {
            int [] a ={1,2,3,4,5};
            System.out.println(a[7]);
            int b = 30/12;
            
            
        } 
        
        
        catch (ArithmeticException e) {
            System.out.println("Bir sayi 0'a bolunemez...");
        
        
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu astiniz...");
        }
        
        catch(Exception e){
            System.out.println("Bir Hata Olustu");
            e.printStackTrace();
        }
        
        System.out.println("Burasi Calisiyor");


    }
    
}
