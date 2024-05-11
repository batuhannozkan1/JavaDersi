
public class Dragon extends Beyblade{
    
    
    private String kutsalCanavar;
    private String gizliYetenek;
    
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Kutcal Canavar Adi : "+kutsalCanavar);
        System.out.println("Gizli Yetenek : "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        
       System.out.println(getBeybladeci() + " "+kutsalCanavar+" ı ortaya cikariyor...");
       System.out.println(getBeybladeci() + " in  saldirisi :  Hayalet Kasirgasi");
    }
    
    
}
