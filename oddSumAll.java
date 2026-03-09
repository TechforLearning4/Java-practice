import java.util.Scanner;

public class oddSumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value till which you want to see the sum: ");
        int num =sc.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is " + sum);
        sc.close();
        
    }

    //Doing sum of all odd sum till  the number the user want to perform operation
    public static int oddSum(int num){
        int sum=0;
        for(int i=1;i<=num;i+=2){
            sum+= i;

        }
        return sum;
    }
}