
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkiciListesi = new ArrayList<String>();
    
    public void sarkicilariBastir(){
        
        System.out.println("Sarkici Listesinde "+sarkiciListesi.size()+" Kadar Sarkici Var.");
        
        for (int i = 0; i < sarkiciListesi.size(); i++) {
            
            System.out.println((i+1)+" .Sarkici : "+sarkiciListesi.get(i));
        }
    }
    
    
    public void sarkiciEkle(String isim){
        
        sarkiciListesi.add(isim);
        
        System.out.println("Sarkici Listesi Guncellendi...");
    }
         
    
    public void sarkiciSil(int pozisyon){
        
        String isim = sarkiciListesi.get(pozisyon);
        
        sarkiciListesi.remove(isim);
        
        System.out.println(isim + " isimli sarkici listeden silindi...");
    }
    
    
    public void sarkiciGuncelle(String yeniİsim,int pozisyon){
        
        sarkiciListesi.set(pozisyon, yeniİsim);
        
        System.out.println("Sarkici Listesi Guncellendi...");
    }
    
    
    public void sarkiciAra(String sarkiciİsmi){
        
        int pozisyon = sarkiciListesi.lastIndexOf(sarkiciİsmi);
        
        if (pozisyon >=0) {
            System.out.println("Sarkici Bulundu.");
            
            System.out.println(sarkiciİsmi + " isimli sarkici "+(pozisyon+1)+" pozisyonda");
        }
        
        else{
            System.out.println("Sarkici bulunamadi");
        }
    }
            
            
            
            
            
}
