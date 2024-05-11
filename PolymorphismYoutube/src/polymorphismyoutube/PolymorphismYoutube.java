
package polymorphismyoutube;


public class PolymorphismYoutube {

    
    public static void main(String[] args) {
       
       // Hayvan hayvan = new Hayvan();
        // HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(hayvan);
       // Kopek kopek = new Kopek();
       // Kedi kedi = new Kedi();
      //  HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(kopek);
      //  HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(kedi);
      Hayvan hayvan = new Kedi();
      HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(hayvan);
        hayvanYonetimi.sesVer();
        //hayvan.sesCikar();
      
        
        
        
        
    }
    
}
