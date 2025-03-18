package Practice;

public class Pattern6 {
    public static void main(String[] args) {

                //        123
                //        12
                //        1

        for (int i=1;i<=4;i++){
            for (int j=1;j<4-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
