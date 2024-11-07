interface Vehicle {

    void start();

    void stop();

    default void fuelUp() {
        System.out.println("Fuel up ");
    }

    static void service() {
        System.out.println("Pojazd wymaga serwisu ");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car start ");
    }

    @Override
    public void stop() {
        System.out.println("Car stop ");
    }
}

class Motorcycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Motorcycle start ");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stop ");
    }
}

class Application {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.stop();
        Vehicle.service();
        car.fuelUp();

        motorcycle.start();
        motorcycle.stop();
        Vehicle.service();
        motorcycle.fuelUp();
    }
}
