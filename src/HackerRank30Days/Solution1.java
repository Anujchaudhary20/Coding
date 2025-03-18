package HackerRank30Days;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int x=scan.nextInt();
        double y=scan.nextDouble();
        scan.nextLine();
        String z=scan.nextLine();
        System.out.println(i+x);
        System.out.format("%.1f",(d+y));
        System.out.println();
        System.out.println(s+z);
        scan.close();
    }
}
