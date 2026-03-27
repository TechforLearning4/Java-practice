package array;

import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array occurrences\n");
        int[] numArr = YesUtility.createArray();
        System.out.println("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noofOccurrences(numArr, num);
        System.out.println("Your element was found " + occurrences + " times in the array.");
        input.close();
    }

    public static int noofOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
