import java.util.Scanner;

public class mul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to see the multiplication table:");
        int num = sc.nextInt();
        for(int i = 1 ;i<=10;i++){
           int product = num * i;
           System.out.println(num + "*" + i + " = " + product);
           sc.close();
        }
    }
}