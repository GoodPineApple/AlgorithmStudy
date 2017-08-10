package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class AutoBoxing {

    public static void main(String[] argv) {

        int idx = 0;
        char[] charArray = new char[10];

        charArray[idx++] = '0';
        charArray[idx++] = 65;      // char자료형에서 65는 A를 의미함.
        charArray[idx++] = 'A' + 1;     // 65+1 = 66 = B

        System.out.println( charArray );    // 0AB
    }

}
