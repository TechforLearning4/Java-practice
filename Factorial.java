import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number you want to see the factorial: ");
        int num =sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        sc.close();
    }

    public static int factorial(int factorialMul){
        if(factorialMul<0){
            System.out.println("Factorial is not defined for negative number. ");
        }

        int fact =1;
        for(int i =1; i<=factorialMul ;i++){
            fact *= i;
        }
        
        return fact;
    }
}