package BasicPrinciples.SRP;

public class SRP1 {
    public static void main(String[] args){
        /*
        Single Responsibility Principle (SRP)
        "Bir nesneyi değiştirmek için tek bir neden olmalıdır."
        Her sınıfın , fonksiyonun veya işlevin sadece bir sorumluluğu olması durumudur.
        */

        int a=5,b=5,c=5;

        // double w = a + ++b * c/a + b + 2 * c/a;
        // Böyle Bir kod yazmak yerine aşağıdaki gibi bir kod yazmak ileride olabilecek karmaşıklığı engeller.

        double w = 0.0;
        ++b;
        b = b^2;
        double d = c / a;
        w = a + (b+2) * d;
        System.out.println(w);
    }
}
