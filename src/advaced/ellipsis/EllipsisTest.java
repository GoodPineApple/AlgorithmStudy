package advaced.ellipsis;

/*
    출처: http://java.ihoney.pe.kr/155 [허니몬(Honeymon)의 자바guru]
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EllipsisTest {
    @Test
    public void testEllipsis() {
        assertThat(lengthEllipsis(3, 4, 5, 6), is(4));      // assertThat(A, is(B)) A의 값이 B인지 확인한다.
        assertThat(countEllipsis(2, 3, 4, 5, 6), is(20));
        assertThat(stringEllipsis("Korea", "Japan", "China"), is("Korea is Strong country."));
    }

    private String stringEllipsis(String...national) {
        String stmt = null;
        for (int i = 0; i < national.length; i++ ){
            if("Korea".equals(national[i])) {
                stmt = national[i] + " is Strong country.";
            }
        }
        return stmt;
    }

    private Integer countEllipsis(int... numberArray) {
        int sumresult = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sumresult += numberArray[i];
        }
        return sumresult;
    }

    private Integer lengthEllipsis(int... number) {
        return number.length;
    }

}


