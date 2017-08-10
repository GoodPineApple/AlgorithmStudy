package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class OperatorTest {

    public static void main(String[] argv) {
        int a = 10;
        boolean b = false;
        if ((b == true) || (a++ == 10)) {       // 관계연산자를 먼저 확인한 후에 ++연산자가 작동함.
            System.out.println("Equal " + a);
        } else {
            System.out.println("Not equal! " + a);
        }
    }
}

