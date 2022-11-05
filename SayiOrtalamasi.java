import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, j=-1, i=0, toplam=0,sayi1;
        double ort;
        System.out.println("Lütfen bir sayi giriniz");
        sayi=giris.nextInt();
        for (; i<=sayi;i++){
            if (i%3==0 && i%4==0){
                sayi1=i;
                toplam+=sayi1;
                j++;
            }
        }
        ort=toplam/j;
        System.out.println(ort);
    }
}
