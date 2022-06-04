public class Vehicles {

    public static abstract class Vehicle {
        public int wheels() {
            return 0;
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public int wheels() {
            return 2;
        }
    }

    public static class Car extends Vehicle {
        @Override
        public int wheels() {
            return 4;
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public int wheels() {
            return 18;
        }
    }

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println("Bike has " + bike.wheels() + " wheels"); // 2
        System.out.println("Car has " + car.wheels() + " wheels"); // 4
        System.out.println("Truck has " + truck.wheels() + " wheels"); // 18
    }

}