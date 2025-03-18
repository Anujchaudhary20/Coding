package Practice;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int number1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int number2 = sc.nextInt();

        System.out.println("choice available are");
        System.out.println("1 add");
        System.out.println("2 sub");
        System.out.println("3 mul");
        System.out.println("4 divide");

        System.out.println("Enter choice ");
        int choice = sc.nextInt();

        System.out.println("Your choice are");
        System.out.println("Number1" +number1);
        System.out.println("Number2" +number2);
        System.out.println("choice "+ choice);

        if(choice==1){
            System.out.println(number1 +number2);
        }else if (choice==2){
            System.out.println(number1 -number2);
        } else if (choice==3) {
            System.out.println(number1 *number2);
        }else if (choice==4) {
            System.out.println(number1 /number2);
        }

    }
}
