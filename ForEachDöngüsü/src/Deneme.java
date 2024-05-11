
public class Deneme {

   private String isim;
   
   public void yaz(){
       System.out.print(" "+isim+" ");
   }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Deneme(String isim) {
        this.isim = isim;
    }
}
