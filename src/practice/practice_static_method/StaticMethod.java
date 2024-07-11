package practice.practice_static_method;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student st1 = new Student(01, "Phuc");
        Student st2 = new Student(02, "Tan");

        st1.display();
        st2.system();
    }
}
