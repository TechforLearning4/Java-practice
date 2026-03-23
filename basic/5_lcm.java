import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter your number: ");
        int first = sc.nextInt();
        System.out.print("PLease enter your number: ");
        int second =sc.nextInt();
        int result = calculatelcm(first , second);
        System.out.println("LCM of the two numbers is: " + result);
        sc.close();
    }

    public static int calculatelcm(int first , int second){
        int i=1;
        while(true){
            int factor =first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
