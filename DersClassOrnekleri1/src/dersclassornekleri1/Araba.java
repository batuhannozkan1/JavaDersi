
package dersclassornekleri1;


public class Araba {
    
    public String marka;
    public String model;
    public int modelYili;
    public String yakitTipi;
    public int kilometre;
    public String renk;
    public int motorHacmi;
    
    public void calistir(){
        System.out.println(marka+" "+model+" calisti.");
    }
    
    public void itme(){
        if (modelYili>20) {
            System.out.println(marka+" "+model+" arkadan itisli");
        }
        else{
            System.out.println(marka+" "+model+" onden cekisli");
        }
    }
    
    public void cekme(){
        if (modelYili<20) {
            System.out.println(marka+" "+model+" arkadan itisli");
        }
        else{
            System.out.println(marka + " "+ model+" onden cekisli");
        }
    }
    
    public void bilgileriGoster(){
        System.out.println("---------------------");
        System.out.println("Arac marka : "+marka);
        System.out.println("Arac model : "+model);
        System.out.println("Arac model yili : "+modelYili);
        System.out.println("Arac rengi : "+renk);
        System.out.println("Arac kilometre : "+kilometre);
        System.out.println("Arac yakit tipi : "+yakitTipi);
        System.out.println("Arac motor hacmi : "+motorHacmi);
        System.out.println("Arac vergisi : "+vergiHesapla(modelYili)+" TL");
        System.out.println("Arac ortalama yakit tuketimi : "+yakitTuketimHesapla(yakitTipi)+" Lt");
    }
    
    
    public int yakitTuketimHesapla(String yakitTipi){
        if (equals("Dizel")) {
            return 5;
        }
        else return 7;
    }
    
    public double vergiHesapla(int modelYili){
        int yasAraligi = 2024-modelYili;
        if (yasAraligi<3) {
            return 7500;
        }
        else if(yasAraligi<7){
            return 5000;
        }
        else if(yasAraligi<10){
            return 3500;
        }
        else return 2500;
    }
    
}
