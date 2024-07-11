package sermon;

public class Student {
    int id;
    String name;
    static String college = "Codegym";

    static void change() {
        college = "BachKhoa";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student st1 = new Student(01, "Phuc");
        Student st2 = new Student(02, "Hao");
        st1.display();
        st2.display();
    }
}
