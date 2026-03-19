import java.util.Scanner;

public class computesSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to see the sum of digits: ");
        int num =sc.nextInt();
        int sum =compute(num);
        System.out.println("sum of digits is:" + sum);
        sc.close();
    }

    public static int compute(int num){
        int sum = 0;
        while(num>0){
           sum =sum +num%10;
           num =num / 10;

        }

        
        return sum;
    }
}
