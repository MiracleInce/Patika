import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int yil;
        System.out.println("Hesaplanacak yılı giriniz");
        yil=giris.nextInt();

        if(yil%4==0 || yil%400==0 )
            System.out.println("Girdiğiniz yıl artık yıldır");
        else
            System.out.println("Girdiğiniz yıl artık yıl değildir");
    }
}