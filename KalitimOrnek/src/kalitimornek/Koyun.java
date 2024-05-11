
package kalitimornek;


public class Koyun extends Hayvan{


  public String renk;
  
  public void kirp(){
      
      System.out.println("Kirpiliyor...");
  }

    @Override
    public void yemekVer() {
      
        System.out.println("Ot verildi...");
    }
  
  
}
