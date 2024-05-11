
public class Main {
    public static void main(String[] args) {
        
        
        Account account1 = new Account("Batuhan Yasar Ozkan","by1016732@gmail.com","1345432");
        
        Account account2 = account1;
        
        Account account3 = new Account();
        
        if (account1==account2){
            System.out.println("1 ile 2 Ayni objeyi gosteriyorlar");
        }
        if(account1==account3){
            System.out.println("1 ile 3 Ayni objeyi gosteriyorlar");
        }
        else{
            System.out.println("1 ile 3 Ayni objeyi gostermiyorlar");
        }
        
        
    }
}
