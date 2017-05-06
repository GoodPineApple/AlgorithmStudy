package compareString;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

// https://www.hackerrank.com/challenges/java-string-compare
public class SolutionSortedSet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    String str=scan.next();
	    int k=scan.nextInt();
	    
	    SortedSet<String> sortedSet = new TreeSet<>();
	    
	    for(int i = 0; i <= str.length()-k; i++){
	    	sortedSet.add(str.substring(i, i+k));
	    }
	    System.out.println(sortedSet.first());
	    System.out.println(sortedSet.last());
	}

}
