package array;

import java.util.Scanner;
import java.util.Arrays;

public class Maxmin {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Welcome to Maximum and Minimum: ");
    int arraySize ;
    do{
        System.out.println("Enter the size of the array: ");;
        arraySize = input.nextInt();    

        if (arraySize <= 0){
            System.out.println("Invalid input! Re-enter the size fo array. ");
            
        }
    }while(arraySize<=0);

    int[] arr = new int[arraySize];        
    int i=0;
    while(i<arraySize){
        System.out.print("Enter the element at position "+ (i+1)+ " : ");
        arr[i] = input.nextInt();
        i++;
    }
    System.out.println(Arrays.toString(arr));
    
    int min =min(arr);
    System.out.println(min + " is the minimum number inside the array.");
    int max =max(arr);
    System.out.println(max + " is the maximum number inside the array.");
    input.close();
}

public static int min(int arr[]){
    
    int min = arr[0];
    int i=1;
  
    while(i<arr.length) {
        if(min>arr[i]){
            min = arr[i];
        }
        i++;
    }
    return min;
}
public static int max(int arr[]){
    int max = arr[0];
    int i =1;
    while(i<arr.length) {
        if(max<arr[i]){
            max = arr[i];
        }
        i++;
    }
    return max;
}
}
