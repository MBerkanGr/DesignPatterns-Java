package BasicPrinciples.OCP;

public class OCP1 {
    public static void main(String[] args) {
        /*
        Open–Closed Principle (OCP)
        Yazılım yapıları (Sınıflar , fonksiyonlar vs. ) genişletmeye açık ama değişime kapalı olmalıdır.
        OCP'nin amacı tekrar kullanabilirliği ve bakımlanabilirliği arttırmak.
        */

        /*
        Employee Örneği
        Employee_1 sınıfına yeni bir çalışan eklenirse sistem kırılacak ve yeni case eklenmesi gerekecek.
        Employee_2 ' de ise EmployeeInterface oluşturalarak her eklenen çalışana implement ettiğimiz zaman , sistemi
        kırmadan direkt eklenebilecek.
        Böylece kodda değişiklik olmadan yeni çalışan tipleri eklenebilir duruma gelecek.
        */
    }
}
