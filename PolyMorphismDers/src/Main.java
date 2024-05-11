
public class Main {
    public static void main(String[] args) {
        Hayvanlar h1 = new Hayvanlar("Gergedan");
        
        h1.seslendir();
        
        Kedi k1 = new Kedi("Masuk","Van Kedisi");
        k1.seslendir();
        
        Scootish s1 = new Scootish("Sarya", "British", "Beyaz");
        s1.seslendir();
        
        //American a1 = new American("Rina","American Scootish","Sari",25);
        
        
        Kopek ko = new Kopek("Zeyna","Golden");
        k1.seslendir();
        
        CobanKopekleri c1 = new CobanKopekleri("Karabas","Kangal", "Safkan");
        c1.seslendir();
        
    }
}
