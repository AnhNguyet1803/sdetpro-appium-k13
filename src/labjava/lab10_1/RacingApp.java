package labjava.lab10_1;

import java.security.SecureRandom;
import java.util.Arrays;

import static labjava.lab10_1.Animal.Builder;

public class RacingApp {
    public static void main(String[] args) {
        Animal horse = new Builder().setName("Horse").setSpeed(generateAnimalSpeed(70))
                .setFlyable(false).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(generateAnimalSpeed(100))
                .setFlyable(false).build();
        Animal eagle = new Builder().setName("Eagle").setSpeed(generateAnimalSpeed(60))
                .setFlyable(false).build();
        Animal winner = new RacingController().getWinner(Arrays.asList(horse, tiger, eagle));
        //Animal winner = new RacingController().getWinner(horse, tiger, eagle);
        System.out.println(winner);
    }

    private static int generateAnimalSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed) + 1;
    }
}
