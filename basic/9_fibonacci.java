import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    fib(num);
    sc.close();        
    }

    public static int fib(int num){
        if(num < 1) return 0;
        System.out.print("0 ");
        if(num == 1) return 1;
        System.out.print("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        return num;
    }
}
