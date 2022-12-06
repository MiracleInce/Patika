import javax.swing.*;

public class Student {
    String name, no, sinif;
    Course tarih;
    Course biyoloji ;
    Course fizik;
    double ort;
    boolean isPass;

    Student(String name, String no, String sinif, Course tarih, Course biyoloji, Course fizik) {
        this.name = name;
        this.no = no;
        this.sinif = sinif;
        this.tarih = tarih;
        this.biyoloji =biyoloji;
        this.fizik = fizik;
        this.ort = 0.0;
        this.isPass = false;
    }

    void notAtama(int tarih, int fizik, int biyoloji,int tarihsoz,int fiziksoz,int byosoz) {
        if (tarih >= 0 && tarih <= 100 && fizik >= 0 && fizik <= 100 && biyoloji >= 0 && biyoloji <= 100) {
            this.tarih.note = tarih;
            this.biyoloji.note = biyoloji;
            this.fizik.note = fizik;
        }
        if (tarihsoz>=0 && tarihsoz<=100 && fiziksoz>=0 && fiziksoz<=100 && byosoz>=0 && byosoz<=100){
            this.tarih.sozlu = tarihsoz;
            this.biyoloji.sozlu = byosoz;
            this.fizik.sozlu = fiziksoz;
        }
    }

    void printNote(){
        System.out.println(this.tarih.name + "=>Notu: " + this.tarih.note);
        System.out.println(this.biyoloji.name + "=>Notu: " + this.biyoloji.note);
        System.out.println(this.fizik.name + " =>Notu: " + this.fizik.note);
        System.out.println(this.tarih.name + "=> Sözlü Notu: " + this.tarih.sozlu);
        System.out.println(this.biyoloji.name + "=>Sözlü Notu: " + this.biyoloji.sozlu);
        System.out.println(this.fizik.name + " =>Sözlü Notu: " + this.fizik.sozlu);
    }




    void isPass(){
        this.tarih.toplam=(this.tarih.note*0.6+this.tarih.sozlu*0.4);
        this.fizik.toplam=(this.fizik.note*0.8+this.fizik.sozlu*0.2);
        this.biyoloji.toplam=(this.biyoloji.note*0.7+this.biyoloji.sozlu*0.3);
        this.ort=(this.tarih.toplam+this.fizik.toplam+this.biyoloji.toplam)/3.0;
        if (this.ort<55){
            System.out.println("Üzgünüz. Sınıfta Kaldınız!!");
        }else
            System.out.println("Sınıfı Başarıyla Geçtiniz!!");
    }

}
