package labjava;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input your weight.
        System.out.print("Your weight(kg): ");
        double yourWeight = scanner.nextDouble();

        //Input your height.
        System.out.print("Your height(m): ");
        double yourHeight = scanner.nextDouble();

        //BMI.
        double yourBMI = yourWeight / (yourHeight * yourHeight);
        System.out.println("Your BMI: " + yourBMI);

        //Determine BMI classification.
        if(yourBMI < 18.5){
            System.out.println("Underweight!");
        } else if (yourBMI >= 18.5 && yourBMI <= 24.9) {
            System.out.println("Normal weight!");
        } else if (yourBMI >= 25 && yourBMI <= 29.9) {
            System.out.println("Overweight!");
        } else {
            System.out.println("Obesity!");
        }
    }
}
