import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int r;
        double pi=3.14, aci,alan;
        System.out.println("Lütfen dairenin yarıçapını giriniz");
        r=inp.nextInt();
        System.out.println("Lütfen merkez açısının değerini derece cinsinden giriniz");
        aci=inp.nextDouble();
        alan=(pi * (r*r) * aci) / 360;
        System.out.println("Girdiğiniz değerlere ait daire diliminin alanı: "+alan);
    }
}