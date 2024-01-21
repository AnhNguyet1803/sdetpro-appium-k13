package labjava;

import java.security.SecureRandom;
import java.util.Arrays;

public class lab3_1 {
    public static void main(String[] args){
        final int ARRAY_LENGTH = 5;
        final int MAX_VALUE = 100;

        int[] myArray = new int[ARRAY_LENGTH];

        int oddCount = 0;
        int evenCount = 0;

        for(int index = 0; index < ARRAY_LENGTH; index++){
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray[index] = randomValue;
        }
        System.out.println(Arrays.toString(myArray));
        for (int num : myArray){
            if(num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);

    }
}
