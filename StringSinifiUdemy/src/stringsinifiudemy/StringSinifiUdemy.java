
package stringsinifiudemy;


public class StringSinifiUdemy {

    
    public static void main(String[] args) {
      
        
        String b ="Batu";
        
       // System.out.println(b);
       
      //  System.out.println(b.length()); 
      
     /*   System.out.println("0. indeks : "+ b.charAt(0));
        System.out.println("2.indeks : "+ b.charAt(2));
        System.out.println("son eleman : "+ b.charAt(b.length()-1));  */
     
     
        /*for (int i = 0; i < b.length(); i++) {
            
            System.out.println(b.charAt(i));
        }*/
        
       // System.out.println(b.startsWith("Ba")); Ba ile başlıyor mu ?
       
       // System.out.println(b.endsWith("tu"));   tu ile bitiyor mu ?
       
      //  System.out.println(b.indexOf("a"));   a harfi baştan kaçıncı
      
     //   System.out.println(b.lastIndexOf("u"));
     
     //   System.out.println(b.toLowerCase());   bütün harfleri küçüğe çevirir.
         
      //    System.out.println(b.toUpperCase()); bütün harfleri büyüğe çevirir.
      
      String a1 = "1923";
      
     int b1 = Integer.parseInt(a1); //Stringi integera çevirme.
      
    //    System.out.println(b1-42);
    
    String a2 = String.valueOf(b1);// integeri stringe çevirme.
        
        System.out.println(a2);
        
        
        String c1 = "Batu";
        String c2 ="Batu";
        
        if (c1==c2) {
            System.out.println("esitler");
        }
        
        String d1 = new String("Batu");
        String d2 = new String("Batu");
        
        if (d1.equals(d2)) {
            System.out.println("esitler");
        }
      
                
    }
    
}
