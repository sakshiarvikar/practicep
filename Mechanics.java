class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Car is playing music...");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("SportsCar turbo boost activated!");
    }
}

public class Mechanics {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        sc.start();       
        sc.playMusic();    
        sc.turboBoost();   
    }
}
