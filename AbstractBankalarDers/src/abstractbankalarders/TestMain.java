
package abstractbankalarders;


public class TestMain {

   
    public static void main(String[] args) {
        
        //Bankalar b1 = new Bankalar();
        //DevletDestekliBanklar ddb1 = new DevletDestekliBanklar();
        //OzelBankalar ob1 = new OzelBankalar();
        Ziraat zb1 = new Ziraat(true, "Batuhan", "Vadesiz", true);
        zb1.paraCek();
        zb1.paraYatir();
        zb1.birikimYap();
        zb1.durumGor();
        zb1.info();
        
       
        
        
        
    }
    
}
