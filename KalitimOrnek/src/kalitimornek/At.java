
package kalitimornek;


public class At extends Hayvan {
    
    public double bacakBoyu;
    public int hiz;
    
    
    public void nalDegis(){
        
        System.out.println("Nal degisti...");
    }
    
    public void egitimVer(){
        
        System.out.println("Egitim verildi...");
    }

    @Override
    public void yemekVer() {
        System.out.println("Yulaf verildi...");
    }
    
}
