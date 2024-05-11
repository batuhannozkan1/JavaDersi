
public class Main {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        h1.ad ="Hayvanlar Alemi";
        h1.turu = "Tum Hayvanlara Selam Olsun";
        h1.beslenme();
        h1.yasama();
        h1.olme();
        
        System.out.println("--------------------------");
        
        Kedi k1 = new Kedi();
        k1.ad = "Pamuk";
        k1.turu ="Kedigiller";
        k1.rengi = "Beyaz";
        k1.cinsi =" Scootish";
        k1.avlanma();
        k1.yasama();
        k1.olme();
        
         System.out.println("--------------------------");
         
         
        Kedi k2 = new Kedi();
        k2.ad = "Badem";
        k2.turu ="Kedigiller";
        k2.rengi = "Kahverengi";
        k2.cinsi =" British";
        k2.avlanma();
        k2.yasama();
        k2.olme();
        
         System.out.println("--------------------------");
         
         
         
        Kopek kopus1 = new Kopek();
        kopus1.ad = "Karabas";
        kopus1.turu ="Kopekgiller";
        kopus1.rengi = "siyah";
        kopus1.cinsi =" Arjantin Dog";
        kopus1.avlanma();
        kopus1.kesifYap();
        kopus1.olme();
        
         System.out.println("--------------------------");
         
         
        Surungenler s1 = new Surungenler();
        s1.ad = "Karabas";
        s1.turu ="Kopekgiller";
        s1.rengi = "siyah";
        //s1.cinsi =" Arjantin Dog";
       // s1.omurgasiVarMi();
        s1.bolunebilmeYetenegi();
        s1.beslenme();
        s1.yasama();
        s1.zararVermeFonksiyonu();
        s1.olme();
        
         System.out.println("--------------------------");
         
         
        VahsiKedi v1 = new VahsiKedi();
        v1.ad = "Jaguar";
        v1.turu ="Kedigiller";
        v1.rengi = "Sari Benekli";
        v1.cinsi ="Yirtici";
        //s1.cinsi =" Arjantin Dog";
       // s1.omurgasiVarMi();
        v1.kamufleOlma();
        v1.kesifYapma();
        v1.beslenme();
        v1.yasama();
        v1.olme();
        
        
         System.out.println("--------------------------");
         
         
         
         
         
    }
 
}
