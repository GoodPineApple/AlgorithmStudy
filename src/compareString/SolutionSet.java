package compareString;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SolutionSet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("insert your sentence");
		String s = in.nextLine();
		System.out.println("insert output length");
		int k = in.nextInt();
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < s.length()-k; i++){
			String tmp = s.substring(i, i+k);
			if(!set.contains(tmp)){
				set.add(tmp);
			}
		}
		System.out.println(Collections.max(set));
		System.out.println(Collections.min(set));
	}

}
