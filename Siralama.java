import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a, b, c;
        System.out.println("Lütfen a sayisini giriniz:");
        a=input.nextDouble();
        System.out.println("Lütfen b sayisini giriniz:");
        b=input.nextDouble();
        System.out.println("Lütfen c sayisini giriniz:");
        c=input.nextDouble();
        if(a<b && a<c){
            if (b<c)
                System.out.println("a<b<c");
            else
                System.out.println("a<c<b");
        }
        else if (b<c && b<a){
            if (a<c)
                System.out.println("b<a<c");
            else
                System.out.println("b<c<a");
        }
        else {
            if (b<a)
                System.out.println("c<b<a");
            else
                System.out.println("c<a<b");
        }
    }
}