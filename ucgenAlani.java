import java.util.Scanner;
public class ucgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan;
        System.out.println("Lütfen ilk kenarı giriniz");
        a=input.nextDouble();
        System.out.println("Lütfen ikinci kenarı giriniz");
        b = input.nextDouble();
        System.out.println("Lütfen 3. kenarı giriniz");
        c=input.nextDouble();
        u= (a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Kenar uzunluklukları girilen üçgenin alanı: "+alan);

    }
}