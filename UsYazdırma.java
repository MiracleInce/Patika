import java.util.Scanner;
public class UsYazdırma {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi, us1=1, us2=1;
        System.out.println("Lütfen bir sayi giriniz");
        sayi=giris.nextInt();
        while (us1 < sayi && us2< sayi){
            System.out.println("4'ün kuvveti: " +us1+ " | " + " 5'in kuvveti: "+us2);
            us1*=4;
            us2*=5;
        }
    }
}