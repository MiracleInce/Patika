import java.util.Scanner;
public class Palindrom {
    static boolean isBul(int n1){
       int temp=n1, reverseNumber=0, lastNumber;
       boolean sonuc;
        while (temp !=0){
            lastNumber=temp % 10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        System.out.println("Sayının tersi ==" + reverseNumber);

        if (n1 == reverseNumber)
            return sonuc=true;
        else
            return sonuc= false;
    }
    public static void main(String[] args)
    {
        int sayi;
        Scanner giris=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        sayi=giris.nextInt();
        System.out.println(isBul(sayi));
    }
}