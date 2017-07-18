package datastructures.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by taemi on 2017-07-18.
 * http://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
 */
public class SolutionComparable {
    public static void main(String[] args) {

        List<Person> nameList = new ArrayList<>();
        nameList.add(new Person("Yang", 27));
        nameList.add(new Person("Park", 18));
        nameList.add(new Person("kim", 15));

        System.out.println("- 정렬 전 : " + nameList);

        Collections.sort(nameList);

        System.out.println("- 정렬 후 : " + nameList);
    }

}

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person p) {
        if(this.age > p.age){
            return 1;
        } else if (this.age == p.age){
            return 0;
        } else {
            return -1;
        }
    }
}
