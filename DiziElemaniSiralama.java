import java.util.Scanner;
import java.util.Arrays;
public class DiziElemaniSiralama {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int eleman, boyut;
        System.out.println("Lütfen kaç elamnlı dizi oluşturmak istediiğiniz giriniz");
        boyut=giris.nextInt();
        int[] list=new int[boyut];
        for (int i=0 ; i<list.length;i++){
            System.out.println("Girmek istediğiniz " +(i+1) + ". elemanı giriniz");
            eleman=giris.nextInt();
            list[i]=eleman;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}