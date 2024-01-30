package labjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args){
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers\n2. Print maximum value\n" +
                "3. Print minimum value\n4. Search number");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userNum = scanner.nextInt();
        ArrayList<Integer> myListRandom = generateRandomArrayList(10);

        //Print all numbers
        if(userNum == 1){
            System.out.println("Generated ArrayList: " + myListRandom);
        }
        //Print maximum value
        else if (userNum == 2) {
            System.out.println("Generated ArrayList: " + myListRandom);
            int maxValue = findMaxValue(myListRandom);
            System.out.println("Maximum value: " + maxValue);
        }
        //Print minimum value
        else if (userNum == 3) {
            System.out.println("Generated ArrayList: " + myListRandom);
            int minValue = findMinValue(myListRandom);
            System.out.println("Minimum value: " + minValue);
        }
        //Search number
        else if (userNum ==4) {
            System.out.println("Generated ArrayList: " + myListRandom);
            Scanner scanner1 = new Scanner(System.in);
            //Input number
            System.out.print("Input number: ");
            int yourNumber = scanner1.nextInt();

            int searchNumber = findNumber(myListRandom, yourNumber);

            if (searchNumber != -1) {
                System.out.println(yourNumber + " is found in the ArrayList at index: " + searchNumber);
            } else {
                System.out.println(yourNumber + " is not found in the ArrayList.");
            }
            scanner.close();
        } else {
            System.out.println("Sorry!! Please input number in Menu!");
        }
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
