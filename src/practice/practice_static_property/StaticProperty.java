package practice.practice_static_property;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
    }
}
