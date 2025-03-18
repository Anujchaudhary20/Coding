package Practice;

public class CountandSumDigit {
    public static void main(String[] args) {

        int number = -123456;
        int count = 0;
        int sum = 0;
        int temp = Math.abs(number);

        if (number==0){
            count=1;
            sum = 0;
        }else{
        while(temp!=0) {
         sum+=temp%10;
         temp=temp/10;
         count++;
        }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
