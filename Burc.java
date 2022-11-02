import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ay,gun;
        System.out.println("Lütfen doğduğunuz ayı giriniz: ");
        ay=input.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz: ");
        gun=input.nextInt();
        if (ay==1){
            if (gun<=21)
                System.out.println("Burcunuz: Oğlak");
            else
                System.out.println("Burcunuz:Kova");
        } else if (ay==2) {
            if (gun<=19)
                System.out.println("Burcunuz: Kova");
            else
                System.out.println("Burcunuz: Balık");
        }else if (ay==3){
          if (gun<=20)
              System.out.println("Burcunuz: Balık");
          else
              System.out.println("Burcunuz: Koç");
        } else if (ay==4) {
            if (gun<=20)
                System.out.println("Burcunu: Koç");
            else
                System.out.println("Burcunuz: Boğa");
        } else if (ay==5) {
            if (gun<=21)
                System.out.println("Burcunuz: Boğa");
            else
                System.out.println("Burcunuz: İkizler");
        } else if (ay==6) {
            if (gun<=22)
                System.out.println("Burcunuz: İkizler");
            else
                System.out.println("Burcunuz: Yengeç");
        } else if (ay==7) {
            if (gun<=22)
                System.out.println("Burcunuz: Yngeç");
            else
                System.out.println("Burcunuz: Aslan");
        } else if (ay==8) {
            if (gun<=22)
                System.out.println("Burcunuz: Aslan");
            else
                System.out.println("Burcunuz: Başak");
        } else if (ay==9) {
            if (gun<=22)
                System.out.println("Burcunuz: Başak");
            else
                System.out.println("Burcunuz: Terazi");
        } else if (ay==10) {
            if (gun<=22)
                System.out.println("Burcunuz: Terazi");
            else
                System.out.println("Burcunuz: Akrep");
        } else if (ay==11) {
            if(gun<=21)
                System.out.println("Burcunuz: Akrep");
            else
                System.out.println("Burcunuz: Yay");
        } else if (ay==12) {
            if (gun<=21)
                System.out.println("Burcunuz: Yay");
            else
                System.out.println("Burcunuz: Oğlak");
        }
    }
}