package datastructures.share.variable;

/**
 * Created by taemi on 2017-08-01.
 */
public class B {
    public static void main(String[] args) {
        A objectA = new A();
        String c = objectA.methodC();
        System.out.println(c);
        String d = objectA.methodD(c);
        System.out.println(d);
    }
}
