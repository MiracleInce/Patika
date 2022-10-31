import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        int islem;
        System.out.println("Lütfen işlem yapmak istediğiniz ilk sayıyı giriniz");
        n1 = input.nextDouble();
        System.out.println("Lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz");
        n2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz\n 1-Toplama \t 2-Çıkarma \t 3-Çarpma \t 4-Bölme");
        islem = input.nextInt();
        switch (islem) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2 :
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0)
                    System.out.println(n1 / n2);
                else
                    System.out.println("Bir sayı 0'a bölünemez");
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz");
                break;
        }
    }
}