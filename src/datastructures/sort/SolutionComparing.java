package datastructures.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by taemi on 2017-07-18.
 */
public class SolutionComparing {
    public static void main(String[] args) {
        List<aPerson> nameList = new ArrayList<>();
        nameList.add(new aPerson("Yang", 15));
        nameList.add(new aPerson("Park", 18));
        nameList.add(new aPerson("kim", 15));

        System.out.println("- 정렬 전 : " + nameList);

        Collections.sort(nameList, Comparator.comparing(aPerson :: getAge).reversed().thenComparing(aPerson::getName).reversed());

        System.out.println("- 정렬 후 : " + nameList);
    }
}
