import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to reverse of the number: ");
        System.out.println("Enter the number you want to reverse: ");
        int num = sc.nextInt();
        int result = rev(num);
        System.out.println("The reverse number is: "+ result);
        sc.close();
    }

    public static int rev(int num){
        int newNum =0;
   
        while(0<num){
           int digit =  num % 10;
            newNum = newNum * 10 + digit;
            num = num/10;
        }
        
       return newNum;
    }
}
