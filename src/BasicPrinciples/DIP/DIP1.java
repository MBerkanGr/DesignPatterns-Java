package BasicPrinciples.DIP;

public class DIP1 {
    public static void main(String[] args) {
        /*
        Dependency Inversion Principle (DIP)
        Yüksek seviyeli modüller aşağı seviye modüllere bağımlı olmamalıdır.
        İkisi de soyutlamalara bağımlı olmalıdır.
        Soyutlamalar detaylara bağımlı olmamalı, detaylar soyutlamalara
        bağımlı olmalıdır.
        Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle
        üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
        */

        /*
        Car Örneği
        Car sınıfında AutomobileService sınıfı, Audi ve Mercedes sınıflarına bağımlıdır.
        Soyutlama yaparak sınıfların bağımlılığını arayüzlerde olmasını sağlarız.
        */
    }
}
