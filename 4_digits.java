import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Welcome to sumofDigits: ");
    System.out.println("Please enter your number: ");
    int num = sc.nextInt();
    int sum =sumofdigits(num);
    System.out.println(sum);
    sc.close();    
    }
    public static int sumofdigits(int num){
        int sum=0;
        while(num > 0){
            sum += num%10;
            num/= 10;
        }
        return sum;
    }
}
