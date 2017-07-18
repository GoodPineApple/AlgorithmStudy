package datastructures.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by taemi on 2017-07-18.
 * http://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort
 */
public class SolutionComparator {
    public static void main(String[] args) {
        class nameLengthCompare implements Comparator<aPerson>{
            @Override
            public int compare(aPerson p1, aPerson p2) {
                return p1.getName().length() > p2.getName().length() ? 1 :
                        p1.getName().length() == p2.getName().length() ? 0 : -1;
            }
        }
        List<aPerson> nameList = new ArrayList<>();
        nameList.add(new aPerson("Yang", 27));
        nameList.add(new aPerson("Park", 18));
        nameList.add(new aPerson("kim", 15));

        System.out.println("- 정렬 전 : " + nameList);

        Collections.sort(nameList, new nameLengthCompare());

        System.out.println("- 정렬 후 : " + nameList);
    }

}

class aPerson{
    String name;
    int age;

    public aPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

}
