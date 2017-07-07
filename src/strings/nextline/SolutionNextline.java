package strings.nextline;

import java.util.Scanner;

/**
 * Created by taemi on 2017-07-07.
 */
public class SolutionNextline {
    static Scanner q = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("n = ");
        int n = q.nextInt();

        int[] a = new int[n];
        String[] b = new String[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter student name: ");
            b[i] = q.nextLine();

            q.next();
            System.out.print("Enter student number: ");

            a[i] = q.nextInt();
        }


        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        for (String j : b)
            System.out.print(j + " ");
    }
}
