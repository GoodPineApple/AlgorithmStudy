package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class ForLoop {
    public static void main(String[] argv) {

        int total = 0;
        for(int i=1; i<=5; i++ ) {
            for(int j=1; j<=i; i++ ) {          // 무한루프에 빠진다. i = 1, j = 1 // i = 2, j = 1 이 뒤로는 계속 i가 j보다 커진다.
                System.out.println(total);
                total ++;
            }
        }

        System.out.println(total);
    }
}
