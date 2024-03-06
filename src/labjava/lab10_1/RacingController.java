package labjava.lab10_1;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public Animal getWinner(List<Animal> animalList){
        Animal winner = null;
        List<Animal> eligibleAnimal = getEligibleRacingAnimals(animalList);

        return winner;
    }
    private List<Animal> getEligibleRacingAnimals(List<Animal> animalList){
        List<Animal> eligibleAnimal = new ArrayList<>();
        for (Animal animal : animalList){
            if(animal.isFlyable()){
                eligibleAnimal.add(animal);
            }
        }
        return eligibleAnimal;
    }

}