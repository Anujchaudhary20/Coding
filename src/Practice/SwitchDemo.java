package Practice;

public class SwitchDemo {

    public static void main(String[] args) {

        int day = 3;

        String dayName;

        switch (day){
            case 1:dayName="Monday";
            break;
            case 2:dayName="Tuesday";
            break;
            case 3:dayName="Wednesday";
            default:
                dayName="Invalid day";
                break;
        }
        System.out.println("The day is:" + dayName);
    }
}
