package odev;
import java.util.Scanner;
public class Hesapla {
    public static void main(String[] args){
        int math, fizik, kimya , turkce, tarih,muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz");
        math = input.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz");
        fizik = input.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz");
        kimya = input.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz");
        turkce = input.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz");
        tarih = input.nextInt();
        System.out.println("Lütfen müzik notunuzu giriniz");
        muzik = input.nextInt();
        ortalama=(math+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız "+ortalama);
        boolean sonuc = ortalama > 60 ;
        String str = (sonuc) ? "Dersten Geçtiniz" : "Dersten Kaldınız";
        System.out.println(str);

    }
}
