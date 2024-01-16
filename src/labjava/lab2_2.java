package labjava;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Input number
        System.out.print("Input number: ");
        int yourNumber = scanner.nextInt();

        int resultNumber = yourNumber % 2;

        if(resultNumber == 0){
            System.out.println(yourNumber + " is an even number.");
        } else {
            System.out.println(yourNumber + " is an odd number.");
        }
    }
}
