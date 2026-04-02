package array;

import java.util.Scanner;

public class searching {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("Welcome to array searching: ");
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        boolean isfound = isfound(arr, num);

        if(isfound){
            System.out.println("Your number was found in the array.");
        }else{
            System.out.println("Your number was not found in the array");
        }

        sc.close();
    }

    public static boolean isfound(int[] arr , int num){
        int i =0;
        while(i < arr.length){
            if(arr[i] == num){
                return true;
            }         
            i++;
        }
        return false;
    }
}
