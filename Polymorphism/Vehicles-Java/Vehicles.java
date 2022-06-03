public class PolymorphismExample {

    public static abstract class Vehicle
    {
        public int wheels(){
            return 0;
        }
    }

    public static class Bike extends Vehicle
    {
        @Override
        public int wheels()
        {
            return 2;
        }
    }

    public static class Car extends Vehicle
    {
        @Override
        public int wheels()
        {
            return 4;
        }
    }

    public static class Truck extends Vehicle
    {
        @Override
        public int wheels()
        {
            return 18;
        }
    }

    public static void main(String[] args)
    {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        V