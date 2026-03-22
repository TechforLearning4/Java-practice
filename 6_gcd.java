import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to gcd:");
        System.out.println("Enter the first number: ");
        int first =input.nextInt();
        System.out.println("Enter the second number: ");
        int second =input.nextInt();
        int GCD =findGcd(first,second);
        System.out.println("The GCD of the number is :" + GCD );
        input.close();
    }

    public static int findGcd(int x, int y){
        int gcdValue =1;
        int i=2;
        int small =least(x,y);
        while(i<=small){
            if(x % i ==0 && y % i==0){
               gcdValue = i;
            }
            i++;
        }

        return gcdValue;
    }

    public static int least(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
