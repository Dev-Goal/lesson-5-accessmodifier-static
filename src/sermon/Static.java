package sermon;

public class Static {
    static public class B {

    }
    public class C {

    }

    public static void main(String[] args) {
        Static.B o = new Static.B();
//        Static.C o2 = new Static.C();
        Static.C o1 = new Static().new C();

    }
}
