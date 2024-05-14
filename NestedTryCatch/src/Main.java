
public class Main {

    public static void main(String[] args) {

        int a = 100;
        int b = 0;
        String metin = null;
        String metin2 = "inspimo";
        int[] dizi = new int[5];

        String yaziliSayi = "elli";

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Hata --> Arithmetic Exception " + e.getMessage());
        }

        try {
            System.out.println(metin.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Hata -->Null Pointer Exception : " + e.getMessage());
        }

        try {
            try {
                System.out.println(metin2.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Hata -->String Index Out Exception :" + e.getMessage());
            }
            try {
                System.out.println(dizi[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hata --> Array Index Out Exception : " + e.getMessage());

            }
            System.out.println(dizi[10]);

        } catch (IndexOutOfBoundsException e) {
        
            System.out.println("Hata --> Intex Out Exception : "+e.getMessage());
        }

      
        
    }
}
