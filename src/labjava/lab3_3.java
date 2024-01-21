package labjava;

import java.security.SecureRandom;
import java.util.Arrays;

public class lab3_3 {
    public static void main(String[] args){
        final int ARRAY_LENGTH = 5;
        final int MAX_VALUE = 100;

        int[] myArray = new int[ARRAY_LENGTH];

        for(int index = 0; index < ARRAY_LENGTH; index++){
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray[index] = randomValue;
        }
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        //int []descendingArray = new int[myArray.length];
        for (int num : myArray){
            System.out.printf(num + ", ");
        }
    }
}
