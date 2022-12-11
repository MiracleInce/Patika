import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int rastgele= (int) (Math.random()*100);
        int hak=0;
        int tahmin;
        int[] yanlis=new int[5];
        boolean isWin = false;
        System.out.println(rastgele);
        while (hak < 5){
            System.out.println("Lütfen tahmininizi giriniz");
            tahmin= giris.nextInt();
            if (tahmin<0 || tahmin>99){
                System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında bir sayı giriniz");
                continue;
            }
            if (tahmin==rastgele){
                System.out.println("Tebrikler tahmin ettiğiniz sayı doğru");
                isWin=true;
                yanlis[hak++]=tahmin;
                System.out.println("Tahminleriniz: "+ Arrays.toString(yanlis));
                break;
            }else{
                yanlis[hak++]=tahmin;
                System.out.println("Tahminleriniz: "+ Arrays.toString(yanlis));
                System.out.println("Hatalı sayı girdiniz");
                if (tahmin<rastgele){
                    System.out.println("Sayı tahmininizden büyüktür");
                }else {
                    System.out.println("Sayı tahmininizden küçüktür");
                }
            }

            System.out.println("Kalan hakkınız: " + (5-hak));
            if (hak==5){
                System.out.println("Hakkınız bitmiştir");
                break;
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz !! Tahminleriniz: " + Arrays.toString(yanlis));
            System.out.println("Sayı: " +rastgele);
        }
    }
}