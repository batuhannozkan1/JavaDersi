
package interfacegirisders;


public interface IArayuz {
   
    
             // -------INTERFACE-----------------
    // Interface sınıf yapısının oluşturulması için 
    // interface anahtar kelimesi kullanılır.
    // Interface başlığında I harfi ile başlanır.
    //Kendisinin impleme edecek sınıfa özellik ve yetenek kazandırmak için kullanılır
    // Çoklu implements(kalıtım) özelliğini tamamlar.
    //can do ilişkisine dayanır
    // Interfaceler çoklu implementi destekler.
    //Birden fazla interface bir sınıfa implement edilebilir.
    //Interfaceler Başka bir sınıfa implement edilmesi için "implements" keywordu kullanılır.
    //Interface elemanlarından
    // 1.Değişkenler tanımlanırken 
        //Public static final dTuru dAdi başlığı kullanılır.
    //2. metot tanımlanırken 
        //1. public acces modifiers, 2. zorunlu polymorphism,3. Gövde yoktur,4.static olamazlar.
    
   // ******************** INTERFACE *******************
    //İnterface içerisinde ögeler için erişim belirteci 
    //Public seçilir (public static final değişkenleri için kullanılır.)
    //can do ilişkisine dayanır.
    //İnterface içerisindeki metotların gövdesi yoktur.(Zorunlu Polymorphism)
    //Interface içerisindeki tüm metotlar Abstract(soyut) yapıdadır.
    //yapıcı ve yıkıcı metotlar kullanılmaz.
    //Static metotlar kullanılmaz.
    //interface içerisindeki metotlar parametre alabilir.
    //instance oluşturulamaz.
    //Interfaceler başka sınıfları ya da Interfaceleri
    //extends ya da imolements edemezler.
    
    
    //******************** ABSTRACT *******************
    //Kalıtım yapısına uygun olarak Public ya da Protected seçilir.
    //is a ilişkisine dayanır.
    //Abstract metotların gövdesi yoktur.
    //Abstract classlar içerisinde hem abstract hemde concrete metotlar tanımlanabilir.
    //yapıcı ve yıkıcı metotlar kullanılabilir.
    // static metotlar kullanılabilir.
    //Abstract içerisindeki abstract metotlar parametre alabilir.
    //instance oluşturulamaz.
    //Abstractlar başka sınıfları ya da Interfaceleri
    //extends ya da implements edebilirler.
    
    
    
    

    
    
}
