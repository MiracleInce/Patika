import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int fak=1, n,r,fak2=1,com=0,fak3=1;
        System.out.println("Lütfen kümenin kaç elemanlı olacağını giriniz");
        n= giris.nextInt();
        System.out.println("Lütfen kaç elemanlı farklı gruplarının sayısını öğrenmek istediğinizi giriniz");
        r=giris.nextInt();
        for (int i=n;i>=1;i--){
            fak*=i;
        }
        for (int j=r;j>=1;j--){
            fak2*=j;
        }
        for (int k=(n-r);k>=1; k--){
            fak3*=k;
        }
        com=fak/((fak2)*fak3);
        System.out.println("C(n,r) kombinasyonu: " +com);
    }
}