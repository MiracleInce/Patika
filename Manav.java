import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double  armut, elma, domates, muz, patlican, toplam;
        System.out.println("Kaç kilo armut: ");
        armut=giris.nextDouble();
        System.out.println("Kaç kilo elma: ");
        elma=giris.nextDouble();
        System.out.println("Kaç kilo domates: ");
        domates=giris.nextDouble();
        System.out.println("Kaç kilo muz: ");
        muz=giris.nextDouble();
        System.out.println("Kaç kilo patlıcan: ");
        patlican=giris.nextDouble();
        toplam=(armut*2.15)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.println("Toplam tutar: "+ toplam);
    }
}