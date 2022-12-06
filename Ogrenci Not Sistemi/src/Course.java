public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double toplam;

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else
            System.out.println("Öğretmenin alanı uyuşmuyor!");
    }

    Course(String name, String code, String prefix){
        this.name =name;
        this.code =code;
        this.prefix=prefix;
        this.note=0;
        this.sozlu=0;
        this.toplam=0;
    }

    void printInfo(){
        this.teacher.print();
    }
}
