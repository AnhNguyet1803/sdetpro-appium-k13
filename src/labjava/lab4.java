package labjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
        System.out.println("Minimum value: " + minValue);

        //Search number
        Scanner scanner = new Scanner(System.in);
        //Input number
        System.out.print("Input number: ");
        int yourNumber = scanner.nextInt();

        int searchNumber = findNumber(myListRandom, yourNumber);

        if (searchNumber != -1) {
            System.out.println(yourNumber + " is found in the ArrayList at index: " + searchNumber);
        } else {
            System.out.println(yourNumber + " is not found in the ArrayList.");
        }

        scanner.close();

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

    //Find Maximum value
    public static int findMaxValue(ArrayList<Integer> arrayList){
        int maxValue = arrayList.get(0);
        for(int index : arrayList){
            if(index > maxValue){
                maxValue = index;
            }
        }
        return maxValue;
    }

    //Find Minimum value
    public static int findMinValue(ArrayList<Integer> arrayList){
        int minValue = arrayList.get(0);
        for(int index : arrayList){
            if(index < minValue){
                minValue = index;
            }
        }
        return minValue;
    }

    //Find number
    public static int findNumber (ArrayList<Integer> arrayList, int fNumber){
        return arrayList.indexOf(fNumber);
    }
}
