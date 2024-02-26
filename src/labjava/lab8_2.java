package labjava;

/*
Horse: Max 75 km/h
Tiger: Max 100 Km/h
Dog: Max 60 KM/h
1- Create an Animal class with a method speed() which return a random speeds
2- Create 3 objects for those 3 animal type
3- Run and see which animal is winner for racing
Print result with format: Winner is <Animal name>, with speed: <speed>
int randomSpeed = new SecureRandom().nextInt(50);
*/

import java.security.SecureRandom;

class Animal{
    public int Speed() {
        return new SecureRandom().nextInt(50);
    }
}

class Horse extends Animal{
    @Override
    public int Speed(){
        return new SecureRandom().nextInt(75);
    }
}

class Tiger extends Animal{
    @Override
    public int Speed(){
        return new SecureRandom().nextInt(100);
    }
}

class Dog extends Animal{
    @Override
    public int Speed(){
        return new SecureRandom().nextInt(60);
    }
}

public class lab8_2 {
    public static void main(String[] args){
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        int speedHorse = horse.Speed();
        int speedTiger = tiger.Speed();
        int speedDog = dog.Speed();

        String winner;
        int maxSpeed = Math.max(speedHorse, Math.max(speedTiger, speedDog));
        if (maxSpeed == speedHorse){
            winner = "Horse";
        } else if (maxSpeed == speedTiger) {
            winner = "Tiger";
        } else {
            winner = "Dog";
        }

        System.out.println("Winner is " + winner + ", with speed: " + maxSpeed + " km/h");
    }
}
