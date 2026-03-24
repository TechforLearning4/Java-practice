package array;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArray =yesUtility.createArray();
        long sum = sum(numArray);
        int avg  = avg(numArray);
        System.out.println("Sum of the numbers is: "+sum);
        System.out.println("Average of the numbers is: "+ avg);
        
    }

    public static long sum(int[] numArray){
        long sum =0;
        int i=0;
        while(i<numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static int avg(int[] numArray){
        long sum=sum(numArray);
        return (int)(sum / numArray.length);
    }
}
