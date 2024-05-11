
public class Drayga extends Beyblade {
    
    
    private String kutsalCanavar;
    
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }


    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
         System.out.println("Kutsal Canavar Adi : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " "+kutsalCanavar+" ı ortaya cikariyor...");
        System.out.println(getBeybladeci() + " in  saldirisi : Kaplan Pencesi");
    }
    
    
}
