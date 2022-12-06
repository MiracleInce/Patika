public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Abdullah", "555", "Tarih");
        Teacher t2=new Teacher("Hüseyin", "553", "Fizik");
        Teacher t3=new Teacher("Yaşar", "505","Biyoloji");
        Course fizik=new Course("Fizik", "FZK", "Fizik");
        Course biyoloji=new Course("Biyoloji", "BİYO", "Biyoloji");
        Course tarih=new Course("Tarih", "TRH" ,"Tarih");
        tarih.addTeacher(t1);
        biyoloji.addTeacher(t3);
        fizik.addTeacher(t2);
        Student  s1=new Student("Mirac", "132", "2", tarih, biyoloji , fizik);
        s1.notAtama(60,75,83,80,70,90);
        s1.printNote();
        s1.isPass();

    }
}