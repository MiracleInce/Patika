import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;
        System.out.println("Hava sıcaklığını giriniz");
        heat=input.nextDouble();
        if(heat<5)
            System.out.println("Kayak yapmaya gidebilirsiniz");
        else if (heat>5 && heat<25) {

            if(heat>10 && heat<15)
            System.out.println("Sinemaya gidebilirsiniz");
            System.out.println("Pikniğe gidebilirsiniz");
            if (heat>5 && heat<10)
                System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat>15 && heat<25) {
            System.out.println("piknik yapabilirsiniz");
        }
        else
            System.out.println("Yüzmeye gidebilirsiniz");
    }
}