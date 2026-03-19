import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number: ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check is prime or not: ");
        int num =sc.nextInt();
        boolean result =isprime(num);
        if(result) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
    public static boolean isprime(int x){
        if(x <=1){
            System.out.println("The number is not prime.");
            return false;
        }

        int i =2;
        while ( i < x){
            if(x % i == 0){
                return false;
            }
            i++;
        }
        return true;
        

       
    }
}
