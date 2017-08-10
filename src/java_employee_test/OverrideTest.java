package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class OverrideTest {
    public static void main() {
        SuperClass a = new SubClass();
        a.doh(1);
//        new OverrideTest().test();
    }

    private void test() {
        SuperClass a = new SubClass();
        a.doh(1);
    }

    static class SuperClass {
        public char doh(char c) {
            System.out.println("doh(char)");
            return 'c';
        }

        public float doh(float f) {
            System.out.println("doh(float)");
            return 1.0f;
        }
    }

    static class OtherClass { }

    static class SubClass extends SuperClass {

        public void doh(OtherClass o) {
            System.out.println("doh(OtherClass)");
        }
    }
}
