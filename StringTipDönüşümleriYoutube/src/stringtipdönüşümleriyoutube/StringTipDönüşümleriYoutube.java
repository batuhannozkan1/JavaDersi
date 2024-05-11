
package stringtipdönüşümleriyoutube;

public class StringTipDönüşümleriYoutube {

    public static void main(String[] args) {
     
        String sayi = "45";
        //System.out.println(sayi+10);
        
       int a = Integer.parseInt(sayi);// sayıyı integera çevirdik
       
        System.out.println(a+10);
        
       a = Integer.valueOf(sayi);
       
       int toplam = a + 20;
               
        System.out.println(toplam);
        
        
        double ondalik = 27.5; 
        
        int tam =(int) ondalik; // ondalik sayiyi tam sayiya(integera) çevirdik.
        System.out.println(tam);
        
        
        


    }
    
}
