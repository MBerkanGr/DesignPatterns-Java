package BasicPrinciples.ISP;

public class ISP1 {
    public static void main(String[] args) {
        /*
        Interface Segregation Principle (ISP)
        Bütün sorumlulukların tek bir arayüzde bulunmasının yerine özelleştirilip
        birden fazla arayüze bölünmesini tercih etmemizi ifade eden presiptir.
        İstemciler kullanmadıkları arayüzlere bağımlı olmaya zorlanmamalıdır.
        ISP, şişman (fat) ya da kirli (polluted) arayüzlerinden kurtulmak, daha ince,
        odağı yüksek arayüzlere sahip olmak gerektiğini ifade eder.
        Bir arayüzün farklı istemcilere hizmet veren metotlardan oluşan hizmet grupları
        varsa özel ince arayüzlere bölünmelidir.
        İstemciler sadece ihtiyacı olan metotları görmeliler.
        */

        /*
        Animal Örneği
        Eğer Dog, Cat ve Bird sınıfları Animal arayüzünü implement ederse ihtiyaç duymadıkları
        metotları da override etmek zorunda kalacaklar.
        Onun yerine Animal arayüzünü özelleştirerek böldüğümüzde sınıflar sadece ihtiyaç duydukları
        arayüzleri implement edecekler.
        */
    }
}
