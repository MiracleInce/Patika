import java.util.Scanner;
public class Ucus {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        double km, fiyat=0.1, ucret;
        int yas, yolculukTipi;
        System.out.println("Lütfen kaç km gideceğinizi yazınız");
        km=giris.nextDouble();
        System.out.println("Yolculuk tipiniz\n 1-Tek Yön \t 2-Gidiş-Dönüş");
        yolculukTipi=giris.nextInt();
        System.out.println("Lütfen yaşınızı giriniz");
        yas=giris.nextInt();
        ucret=(km*fiyat);
        if (km>0 && yas>0 && yolculukTipi==1 || yolculukTipi==2){
            if(yolculukTipi==2){
                ucret=2*(ucret-(ucret*0.2));
                if (yas<12)
                    ucret=(ucret-ucret*0.5);
                else if (yas>12 || yas<24)
                    ucret=(ucret-ucret*0.1);
                else if (yas>65)
                    ucret=(ucret-ucret*0.3);
            }
            else {
                if (yas < 12)
                    ucret=(ucret-ucret* 0.5);
                else if (yas > 12 && yas < 24)
                    ucret =(ucret-ucret*0.1) ;
                else if (yas > 65)
                    ucret=(ucret-ucret*0.3) ;
                else
                    ucret=km*fiyat;
            }
        }
        else
            System.out.println("Hatalı veri girdiniz");
        System.out.println(ucret);
    }
}