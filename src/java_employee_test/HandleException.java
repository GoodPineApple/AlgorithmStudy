package java_employee_test;

/**
 * Created by taemi on 2017-08-10.
 */
public class HandleException {

    public static void main(String[] argv) {

        String number = "";
        System.out.println( toInt(number) );    // IllegalArgumentException을 발생시키고 종료된다.
        number = "9,900";
        System.out.println( toInt(number) );    // 9,900은 Integer.parseInt()를 통해 숫자 변환이 안된다.
        number = "10";
        System.out.println( toInt(number) );    // 10은 정상출력된다.
    }


    public static int toInt(String strValue) {

        if( strValue == null || strValue.length() == 0 ) {
            throw new IllegalArgumentException();
        }

        int intValue = 0;
        try {
            intValue = Integer.parseInt(strValue);
        }
        catch(Exception e) {
            intValue = 0;
        }

        return intValue;
    }
}
