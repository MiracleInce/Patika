import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi, toplam=0;

        do {
            System.out.println("Lütfen bir sayi giriniz");
            sayi= giris.nextInt();
                if (sayi%4==0){
                    toplam+=sayi;
                }

        }while (sayi%2==0);
        System.out.println("Girdiğiniz sayıya kadar olan 4'ün katı olan sayıların toplamı: "+ toplam);
    }
}