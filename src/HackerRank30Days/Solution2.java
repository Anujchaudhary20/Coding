package HackerRank30Days;

import java.io.*;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost*tip_percent/100;
        double tax = tax_percent*meal_cost/100;

        double total_cost = meal_cost +tip + tax;
        System.out.println((int)total_cost);
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
