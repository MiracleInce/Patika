import java.util.Scanner;
public class SayiOrtalamasi {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,ort, j=0, i=0;
        System.out.println("Lütfen bir sayi giriniz");
        sayi=giris.nextInt();
        for (; i<sayi;i++){
            if (i%12==0){
                i+=i;
                j++;
            }
        }
        ort=i/j;
        System.out.println(ort);
    }
}