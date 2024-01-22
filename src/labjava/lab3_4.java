package labjava;

import java.security.SecureRandom;
import java.util.Arrays;

public class lab3_4 {
    //Merge 2 SORTED integer array into one SORTED array
    public static void main(String[] args){
        final int ARRAY1_LENGTH = 5;
        final int ARRAY2_LENGTH = 5;
        final int MAX_VALUE = 100;

        int[] myArray1 = new int[ARRAY1_LENGTH];

        for(int index = 0; index < ARRAY1_LENGTH; index++){
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray1[index] = randomValue;
        }
        System.out.println(Arrays.toString(myArray1));

        //Sort array 1
        Arrays.sort(myArray1);
        for(int num = 0; num < myArray1.length; num++) {
            System.out.printf(myArray1[num] + " ");
        }
        System.out.println();

        int[] myArray2 = new int[ARRAY2_LENGTH];

        for(int index = 0; index < ARRAY2_LENGTH; index++){
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray2[index] = randomValue;
        }
        System.out.println(Arrays.toString(myArray2));

        //Sort array 2
        Arrays.sort(myArray2);
        for(int num = 0; num < myArray2.length; num++) {
            System.out.printf(myArray2[num] + " ");
        }
        System.out.println();

        int[] sumArray = new int[ARRAY1_LENGTH + ARRAY2_LENGTH];
        int sumIndex = 0;

        System.out.print("Sum Array: ");
        for (int index = 0; index < ARRAY1_LENGTH; index++) {
            sumArray[sumIndex++] = myArray1[index];
            System.out.print(sumArray[sumIndex - 1] + " ");
        }

        for (int index = 0; index < ARRAY2_LENGTH; index++) {
            sumArray[sumIndex++] = myArray2[index];
            System.out.print(sumArray[sumIndex - 1] + " ");
        }
        System.out.println();

        //Sort 2 array
        System.out.println("Sorted 2 array: ");
        Arrays.sort(sumArray);
        for(int num = 0; num < sumArray.length; num++) {
            System.out.printf(sumArray[num] + " ");
        }
    }
}
