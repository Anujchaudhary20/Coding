package String;

public class ReverseStr {

    public static void main(String[] args) {

        String abc = "Anuj";
        String reverse = new StringBuilder(abc).reverse().toString();
        System.out.print(reverse);
    }
}
