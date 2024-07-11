package sermon;

public class Test {
    static public int X = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        Test o = new Test();
        System.out.println(o.X);
        Test.method();
        System.out.println(o.X);
        Test.X = 10;
        System.out.printf("x=%d, y=%d", o.X, Test.X);
    }
}
