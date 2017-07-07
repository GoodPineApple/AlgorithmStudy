package datastructures.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by taemi on 2017-07-07.
 */
public class SolutionStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            isBalanced(input);
            //Complete the code
        }
    }

    private static boolean isBalanced (String s) {

        final ArrayDeque<Character> stack = new ArrayDeque<> ();
        final char[] chars = s.toCharArray ();

        for (char c : chars) {

            // Matching character, . means not initialized
            char mc = '.';

            switch (c) {

                case '(':
                case '{':
                case '[':
                    stack.addFirst (c);
                    break;

                case ')':
                    mc = '(';
                case '}':
                    if (mc == '.') mc = '{';
                case ']':
                    if (mc == '.') mc = '[';

                    if (stack.isEmpty () ||
                            stack.removeFirst () != mc) {
                        return false;
                    }
                    break;

                default:
                    // Any other character is bad input data
                    return false;
            }
        }

        return stack.isEmpty ();
    }
}
