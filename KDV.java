import java.util.Scanner;
public class KDV {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double tutar, KDVmiktar,sonuc;
        System.out.println("Lütfen paranızın tutarını giriniz");
        tutar =input.nextDouble();
        boolean kdv1= tutar>=1000 ;
        boolean kdv2= tutar<1000;
        double kdv = (kdv1) ? 0.18 : 0.8 ;
        KDVmiktar = kdv*tutar;
        sonuc=tutar+KDVmiktar;
        System.out.println("KDV\'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdv);
        System.out.println("KDV miktarı: "+KDVmiktar);
        System.out.println("KDV\'li tutar: "+sonuc);

    }
}
