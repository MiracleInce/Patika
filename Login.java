import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        String username, password, newPassword, istek;
        System.out.print("Kullanıcı adını:");
        username=giris.nextLine();
        System.out.print("Şifreniz:");
        password=giris.nextLine();
        if (username.equals("patika") && password.equals("java101")){
            System.out.println("Giriş başarılı");
        }
        else{
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak için evet yazınız");
        }
        istek=giris.nextLine();
        if(istek.equals("evet")){
            System.out.println("Yeni şifrenizi giriniz");
            newPassword= giris.nextLine();
            if (newPassword.equals("java101"))
                System.out.println("Girdiğiniz şifre esklisiyle aynı olamaz");
            else
                System.out.println("Şifreniz başarıyla değiştirildi");
        }


    }

}