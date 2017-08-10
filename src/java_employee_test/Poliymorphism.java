package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
class Poliymorphism {

    private void f() {
        System.out.println("base class");
    }

    public static void main(String[] argv) {

        Poliymorphism po = new Derived();
        po.f();
    }

    static class Derived extends Poliymorphism {        // 왜 static이여야만 하는거지???

        public void f() {
            System.out.println("sub class");
        }
    }
}

