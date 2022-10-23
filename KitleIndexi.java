import java.util.Scanner;
public class KitleIndexi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m,kg,indeks;
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        m=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        kg=input.nextDouble();
        indeks= (kg)/(m*m);
        System.out.println("Vücut kitle indeksiniz: "+indeks);
    }
}