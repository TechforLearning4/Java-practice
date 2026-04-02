package array;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occerences of elements inside an array: ");
        System.out.println("Declare the size of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter the elememt number at position "+ (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        System.out.println(" " + Arrays.toString(nums));
        System.out.print("Enter the number you want to find: ");
        int number = input.nextInt();
        int occurrences = occurrences(nums , number );
        System.out.println("Your element was found " + occurrences+ " times inside the array. ");
        input.close();
    }
    
    public static int occurrences(int[] nums, int number){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==  number ){
                count = count +1;
            }
        }
        return count;
    }
}
