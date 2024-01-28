package labjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lab4 {
    public static void main(String[] args){

        //Print all numbers
        ArrayList<Integer> myListRandom = generateRandomArrayList(10);
        System.out.println("Generated ArrayList: " + myListRandom);

        //Print maximum value
        int maxValue = findMaxValue(myListRandom);
        System.out.println("Maximum value: " + maxValue);

        //Print minimum value
        int minValue = findMinValue(myListRandom);
        System.out.println("Minimum value: " + maxValue);

    }

    public static ArrayList<Integer> generateRandomArrayList(int size){
        ArrayList<Integer> myArray = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++){
            int randomNumber = random.nextInt(1000);
            myArray.add(randomNumber);
        }
        return myArray;
    }

    public static int findMaxValue(ArrayList<Integer> arrayList){
        int maxValue = arrayList.get(0);
        for(int index : arrayList){
            if(index > maxValue){
                maxValue = index;
            }
        }
        return maxValue;
    }

    public static int findMinValue(ArrayList<Integer> arrayList){
        int minValue = arrayList.get(0);
        for(int index : arrayList){
            if(index < minValue){
                minValue = index;
            }
        }
        return minValue;
    }
}
