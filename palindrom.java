import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to palindrom number: ");
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if(ispalindrome){
            System.out.println("Your number is palindrome number.");
        }else{
            System.out.println("Your number is not palindrome.");
        }
        sc.close();
    }

    public static boolean ispalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
        
    }
    public static int reverse(int num){
        int newNum =0;
   
        while(0<num){
           int digit =  num % 10;
            newNum = newNum * 10 + digit;
            num = num/10;
        }
        
       return newNum;
    }
}
