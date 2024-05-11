
public class Test {
    public static void main(String[] args) {
        
        
        
        Mercedes m1 = new Mercedes();
        m1.aracAdi = "A180";
        
        m1.modelYili = 2024;
        
        m1.fiyat = 850000;
        
        m1.yakitTipi();
        m1.motorHacmi();
        
        System.out.println("Tavsiye edilen satis fiyati : "+m1.fiyatHesapla());
        
        
        MercedesBenzinli mb1 = new MercedesBenzinli();
        
        
        mb1.aracAdi = "A180";
        
        mb1.modelYili = 2024;
        
        mb1.fiyat = 850000;
        
        mb1.yakitTipi();
        mb1.motorHacmi();
        
        System.out.println("Tavsiye edilen satis fiyati : "+mb1.fiyatHesapla());
        
        
        
    }
 
}
