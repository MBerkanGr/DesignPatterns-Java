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
        Headphone Örneği
        Headphone_1 , volumeUp , volumeDown ve openBluetooth metotlarını kapsamaktadır.
        Eğer WiredHeadphone , Headphone_1'i implement ederse openBluetooth özelliğini taşımamasına
        rağmen override etmek zorunda kalır. Onun yerine openBluetooth özelliğini ayrı bir interface oluşturarak
        sadece sahip olan sınıfların implement etmesi sağlanır.
        */
    }
}
