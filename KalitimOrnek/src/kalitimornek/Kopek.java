
package kalitimornek;


public class Kopek extends Hayvan{

    @Override
    public void yemekVer() {
        System.out.println("Et verildi...");
    }
    
    public void yuruyusYap(){
        
        System.out.println("Yuruyus yapildi...");
    }
    
    public void egitimVer(){
        
        System.out.println("Egitim verildi...");
    }

    @Override
    public void asiYap() {
        super.asiYap(); 
        System.out.println("Kuduz asisi da yapildi...");
    }
    
   
}
