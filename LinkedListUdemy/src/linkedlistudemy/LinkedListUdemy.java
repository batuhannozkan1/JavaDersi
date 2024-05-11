
package linkedlistudemy;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListUdemy {
    
    public static void listeyiBastir(LinkedList<String>gidilecekYerler){
      /*  for (String s : gidilecekYerler) {
            System.out.println(s);
        }*/
        
        
        ListIterator<String>iterator = gidilecekYerler.listIterator();
        
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
        }
    }
    
    
    public static void siraliEkle(LinkedList<String>gidilecekYerler,String yeni){
        
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        while (iterator.hasNext()) {// hasNext : bir sonraki eleman var mı yok mu ?
            // next() metodu koleksiyondaki bir sonraki elemanı döndürür
            // hasPrevious öncesi var mı ?
            // iterator üzerinde gezinmemizi sağlıyor.
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0) {
                // iki değer eşit
                
                System.out.println("Listenizde bu eleman zaten var.");
                
                return;
            }
            
            else if (karsilastir<0) {
                
                
                //yeni değer iterator.next ten daha büyük
            }
            
            
            else if (karsilastir>0) {
                iterator.previous();
                iterator.add(yeni);
                return;
            }
            
        }
        
        iterator.add(yeni);
    }

    
    public static void main(String[] args) {
        
            LinkedList<String> gidilecekYerler = new LinkedList<String>();
            
            
            siraliEkle(gidilecekYerler, "Postane");
            siraliEkle(gidilecekYerler, "Market");
            siraliEkle(gidilecekYerler, "Ev");
            
            
          /*  gidilecekYerler.add("Postane");
            gidilecekYerler.add("Market");
            gidilecekYerler.add("Okul");
            gidilecekYerler.add("Kutuphane");
            gidilecekYerler.add("Spor Salonu");
            gidilecekYerler.add("Ev");
            
            gidilecekYerler.add(4,"Adliye");
            
            
            listeyiBastir(gidilecekYerler);*/
            
            
            listeyiBastir(gidilecekYerler);
/*            
            
            // ArrayList nesnesi oluşturma
ArrayList<String> liste = new ArrayList<String>();

// Liste nesnesine elemanlar ekleme
liste.add("Java");
liste.add("Python");
liste.add("C++");

// Iterator nesnesi oluşturma
Iterator<String> iterator = liste.iterator();

// Elemanları yazdırma
while (iterator.hasNext()) {
    String eleman = iterator.next();
    System.out.println(eleman);
}*/
        
    }
    
    
    
}
