import java.util.Scanner;
public class Ortalama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat, turkce, fizik, kimya, muzik, matematik, turk, fiz, kim,muz ;
        double ort;
        System.out.println("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        if(0<=fizik && fizik<=100){
            fiz=fizik;
        }
        else{
            fiz=0;
        }
        if(0<=kimya && kimya<=100){
            kim=kimya;
        }
        else{
            kim=0;
        }
        if(0<=turkce && turkce<=100){
            turk=turkce;
        }
        else{
            turk=0;
        }
        if(0<=muzik && muzik<=100){
            muz=muzik;
        }
        else{
            muz=0;
        }
        if(0<=mat && mat<=100){
            matematik=mat;
        }
        else{
            matematik=0;
        }
        ort=(matematik+turk+fiz+kim+muz)/5;
        if(ort<55)
            System.out.println("Sınıfta kaldınız seneye görüşmek üzere");
        else
            System.out.println("Tebrikler sınıfı başarı ile geçtiniz");
        System.out.println(ort);
    }
}