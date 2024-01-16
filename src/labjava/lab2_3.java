package labjava;

import java.util.Scanner;

public class lab2_3 {
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

        double minTargetBMI = 18.5 * (yourHeight * yourHeight);
        double maxTargetBMI = 24.9 * (yourHeight * yourHeight);

        //Determine BMI classification.
        if(yourBMI < 18.5){
            System.out.println("Underweight!");
            System.out.println("You should increase weight: " + ( minTargetBMI - yourWeight) + " kg");
        } else if (yourBMI >= 18.5 && yourBMI <= 24.9) {
            System.out.println("Normal weight!");
            System.out.println("You are perfect!");
        } else if (yourBMI >= 25 && yourBMI <= 29.9) {
            System.out.println("Overweight!");
            System.out.println("You should decrease weight: " + ( yourWeight - maxTargetBMI) + " kg");
        } else {
            System.out.println("Obesity!");
            System.out.println("You should decrease weight: " + ( yourWeight - maxTargetBMI) + " kg");
        }
    }
}
