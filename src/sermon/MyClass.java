package sermon;

class MyClass {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {1,3};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[0]);
    }
}