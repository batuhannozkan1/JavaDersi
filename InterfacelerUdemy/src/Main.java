
public class Main {

   
    public static void main(String[] args) {
        
        //IMuhendis muhendis1 = new IMuhendis();
        
        IMuhendis m1 = new PcMuhendisi(false,false);
       /* m1.adliSicilSorgula();
        m1.askerlikDurumuSorgula();
        System.out.println(m1.mezuniyetOrtalamasi(2.91));
        
        String[] tecrube ={"Vestel","Havelsan","Turksat"};
        
        m1.isTecrubesi(tecrube);*/
       
       MakineMuhendisi m2 = new MakineMuhendisi(true, false);
       
       String[] tecrube = {};
       
       String[] referans = {"Batu","Yasar"};
       
       m2.adliSicilSorgula();
       m2.askerlikDurumuSorgula();
       System.out.println(m2.mezuniyetOrtalamasi(3.60));
       m2.isTecrubesi(tecrube);
       m2.calis();
       
    }
    
}
