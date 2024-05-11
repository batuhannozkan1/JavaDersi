
package labhesapmakine;

public class İslemler  {
    public int toplama;
    
    public int cikarma;
    
    public int bolme;
    
    public int carpma;

   /* public İslemler(int toplama, int cikarma, int bolme, int carpma) {
        this.toplama = toplama;
        this.cikarma = cikarma;
        this.bolme = bolme;
        this.carpma = carpma;
    }*/
    public void toplama(int sayi1,int sayi2){
       this.toplama = sayi1+sayi2;
        System.out.println(toplama);
    }
     public void cikarma(int sayi1,int sayi2){
       this.cikarma = sayi1-sayi2;
         System.out.println(cikarma);
    }
     
     public void carpma(int sayi1,int sayi2){
       this.carpma = sayi1*sayi2;
         System.out.println(carpma);
    }
     
     public void bolme(int sayi1,int sayi2){
       this.bolme = sayi1/sayi2;
         System.out.println(bolme);
    }

    public int getToplama() {
        return toplama;
    }

    public void setToplama(int toplama) {
        this.toplama = toplama;
    }

    public int getCikarma() {
        return cikarma;
    }

    public void setCikarma(int cikarma) {
        this.cikarma = cikarma;
    }

    public int getBolme() {
        return bolme;
    }

    public void setBolme(int bolme) {
        this.bolme = bolme;
    }

    public int getCarpma() {
        return carpma;
    }

    public void setCarpma(int carpma) {
        this.carpma = carpma;
    }
    
    
    
            
    
}
