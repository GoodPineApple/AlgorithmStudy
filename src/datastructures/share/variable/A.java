package datastructures.share.variable;

/**
 * Created by taemi on 2017-08-01.
 */
public class A {

    public String methodC(){
        String str = "C메소드";
        return str;
    }
    public String methodD(String C){
        String str = "D메소드에 추가한 C메소드 변수 : " + C;
        return  str;
    }
}
