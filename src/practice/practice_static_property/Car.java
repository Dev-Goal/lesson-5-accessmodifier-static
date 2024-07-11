package practice.practice_static_property;

public class Car {
    private String nameCar;
    private String companyCar;
    public static int numberOfCar;

    public Car(String nameCar, String companyCar) {
        this.nameCar = nameCar;
        this.companyCar = companyCar;
        numberOfCar++;
    }
}
