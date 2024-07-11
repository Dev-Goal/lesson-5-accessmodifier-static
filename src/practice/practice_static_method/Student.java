package practice.practice_static_method;

public class Student {
    private int id;
    private String name;
    private static String college = "VKU";
    private static String university = "VKU";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "Codegym";
        university = "vku";
    }

    public void display() {
        System.out.println(id + "-" + name + "-" + college);
    }

    public void system() {
        System.out.println(id + "-" + name + "-" + university);
    }
}
