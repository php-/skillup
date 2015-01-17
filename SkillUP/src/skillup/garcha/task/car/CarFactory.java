package skillup.garcha.task.car;

/**
 * @author skillup
 */
public class CarFactory {
    
    public static Car createCar(String brand, String model, int year) {
        Car car = new Car(brand, model, year);
        return car;
    }
}
