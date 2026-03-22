import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to armstrong number: ");
        int num =sc.nextInt();
        boolean result =arm(num);
        if(result){
            System.out.println(result + " is an armstrong number. ");
        }else{
            System.out.println(result + " is not an armstrong number.");
        }
        
        sc.close();
    }

    public static boolean arm(int num){
        int noOfdigits = noOfdigits(num);
        long finalNumber =0;
        int originalNum = num;
        while(num >0){
            int lastdigit = num%10;
            num =num / 10;
            finalNumber = finalNumber + power(lastdigit, noOfdigits);
        }
        return finalNumber == originalNum;
    }
    public static long power(int num1 , int num2){
        int result = 1;
        int i=0;
        while(i<num2){
            result =result * num1;
            i++;
        }

        return result;
    }

    public static int noOfdigits(int num){
        int digits = 0;
        while(num>0){
            digits ++;
            num=num/10;
        }
     return digits;
    }
}
