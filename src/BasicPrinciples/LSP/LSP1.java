package BasicPrinciples.LSP;

public class LSP1 {
    public static void main(String[] args) {
        /*
        Liskov Substitution Principle (LSP)
        Taban sınıfa işaretci ya da referans kullanan fonksiyonlar ,
        türetilmiş sınıfların nesnelerinide bilmeden kullanabilmelidirler.
        LSP'nin amacı alt sınıflardan oluşan nesnelerin üst sınıfın nesneleri ile yer
        değiştirdikleri zaman, aynı davranışı sergilemesini beklemektir.
        */

        /*
        Shape Örneği
        Square, Rectangle extends ederse Rectangle'nin beklediği Width ve
        Height'i tam anlamıyla karşılayamaz ve LSP'ye uymaz, çünkü Square için
        tek bir kenar bilgisi yeterlidir.
        Shape adında arayüz oluşturarak her sınıfın kendi davranışlarını uygulamasını sağlarız.
        */
    }
}
