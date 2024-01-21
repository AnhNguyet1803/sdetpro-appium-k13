package labjava;

import java.security.SecureRandom;
import java.util.Arrays;

public class lab3_2 {
    public static void main(String[] args){
        final int ARRAY_LENGTH = 5;
        final int MAX_VALUE = 100;

        int[] myArray = new int[ARRAY_LENGTH];

        for(int index = 0; index < ARRAY_LENGTH; index++){
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray[index] = randomValue;
        }
        System.out.println(Arrays.toString(myArray));

        int maxValue = myArray[0];
        int minValue = myArray[0];

        for (int num = 1; num < myArray.length; num++){
            if(myArray[num] > maxValue){
                maxValue = myArray[num];
            }
            if(myArray[num] < minValue){
                minValue = myArray[num];
            }
        }
        System.out.println("Number of max value: " + maxValue);
        System.out.println("Number of min value: " + minValue);
    }
}
