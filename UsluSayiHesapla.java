import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi, üs,sonuc=1;
        System.out.println("Lütfen üssü hesaplanacak sayıyı giriniz");
        sayi= giris.nextInt();
        System.out.println("Lüttfen üssü giriniz");
        üs= giris.nextInt();
        for (int i=0;i <üs;i++){
            sonuc*=sayi;
        }
        System.out.println(sonuc);
    }
}