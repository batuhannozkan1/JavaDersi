
package arraylist;
import java.util.ArrayList;

public class Main {
    
    public static void yazdir(ArrayList<String> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element " + (i+1) + ": " + a.get(i));
        }
        
    }
    
    
    public static void main(String[] args) {
        
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        
        
        
        arraylist.add("Batuhan");
        arraylist.add("Yasar");
        arraylist.add("Ozkan");
    
        //System.out.println(arraylist.get(0));
    
        
        //System.out.println(arraylist.size());//uzunluğunu verir.
        
        
        
      /*  arraylist.remove(2);
        System.out.println(arraylist.get(2));*/
      
      
       // System.out.println(arraylist.indexOf("Yasar")); // indexini verir.
       
      // System.out.println(arraylist.lastIndexOf("Ozkan"));
       
      
     /* arraylist.set(2, "Kilcik");//indexi değiştirir.
        System.out.println(arraylist.get(2));*/
     
     
     yazdir(arraylist);
       
      
        
    }
}
